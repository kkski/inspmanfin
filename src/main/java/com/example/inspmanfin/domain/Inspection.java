package com.example.inspmanfin.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name="inspections")
@Data
public class Inspection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
   // @ManyToOne
    //private Scaffold scaffold;

    @DateTimeFormat
    private Date dateOfInspectionString;
    //@ManyToOne
    //private Inspector inspector;
    private String inspectionMessage = "No message";
    private boolean approved = false;

    @PrePersist
    @PreUpdate
    public void calculateGrade() {

        scaffoldGrade = 7

    }

}
