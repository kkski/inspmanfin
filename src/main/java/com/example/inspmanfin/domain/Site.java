package com.example.inspmanfin.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "sites")
@Data
public class Site {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Size(min = 5)
    private String name;
    @Size(min = 20)
    private String address;
}
