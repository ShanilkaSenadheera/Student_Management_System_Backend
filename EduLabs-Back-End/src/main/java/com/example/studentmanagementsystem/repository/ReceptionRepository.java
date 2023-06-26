package com.example.studentmanagementsystem.repository;

import com.example.studentmanagementsystem.model.Reception;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceptionRepository extends JpaRepository<Reception, Integer> {

}
