package com.example.java23webservices_gritacademyapicarlsundberg.repository;

import com.example.java23webservices_gritacademyapicarlsundberg.entity.Courses;
import com.example.java23webservices_gritacademyapicarlsundberg.entity.StudentsCourses;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentsCoursesRepository extends JpaRepository<StudentsCourses, Long> {

}
