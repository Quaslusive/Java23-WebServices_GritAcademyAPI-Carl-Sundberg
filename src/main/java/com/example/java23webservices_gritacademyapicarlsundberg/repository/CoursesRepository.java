package com.example.java23webservices_gritacademyapicarlsundberg.repository;

import com.example.java23webservices_gritacademyapicarlsundberg.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CoursesRepository extends JpaRepository<Courses, Long> {
    List<Courses> findByNameContainingIgnoreCase(String name);
    List<Courses> findByDescriptionContainingIgnoreCase(String description);

}
