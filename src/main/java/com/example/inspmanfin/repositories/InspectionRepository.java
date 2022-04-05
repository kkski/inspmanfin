package com.example.inspmanfin.repositories;

import com.example.inspmanfin.domain.Inspection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InspectionRepository extends JpaRepository<Inspection, Long> {
}
