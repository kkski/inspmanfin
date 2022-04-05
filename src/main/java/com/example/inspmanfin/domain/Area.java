package com.example.inspmanfin.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "areas")
@Data
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Site site;
    private String name;
}
