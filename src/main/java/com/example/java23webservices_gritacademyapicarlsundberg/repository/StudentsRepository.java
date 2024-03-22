package com.example.java23webservices_gritacademyapicarlsundberg.repository;

import com.example.java23webservices_gritacademyapicarlsundberg.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentsRepository extends JpaRepository<Students, Long> {

    List<Students> findByfName(String fName);

    List<Students> findBylName(String lName);

    List<Students> findBytown(String town);



}
