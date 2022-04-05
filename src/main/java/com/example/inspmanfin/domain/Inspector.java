package com.example.inspmanfin.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "inspectors")
@Data
public class Inspector {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName, lastName, email, password;
    private int inspectorGrade;
    //@ManyToOne
    //private List<Inspection> inspectionsList = new ArrayList<>();




}
