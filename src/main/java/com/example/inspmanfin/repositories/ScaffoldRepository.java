package com.example.inspmanfin.repositories;

import com.example.inspmanfin.domain.Scaffold;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScaffoldRepository extends JpaRepository<Scaffold, Long> {
    List<Scaffold> findAllByScaffoldGrade(int scaffoldGrade);
}
