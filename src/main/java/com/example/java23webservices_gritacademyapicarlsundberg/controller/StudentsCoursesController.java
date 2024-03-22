package com.example.java23webservices_gritacademyapicarlsundberg.controller;

import com.example.java23webservices_gritacademyapicarlsundberg.DTO.StudentsCoursesDTO;
import com.example.java23webservices_gritacademyapicarlsundberg.entity.Students;
import com.example.java23webservices_gritacademyapicarlsundberg.entity.StudentsCourses;
import com.example.java23webservices_gritacademyapicarlsundberg.service.StudentsCoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/studentcourses")
public class StudentsCoursesController {

    @Autowired
    StudentsCoursesService studentsCoursesService;

    @GetMapping(value = "/studentscourses", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAllStudentsCourses() {
        List<StudentsCoursesDTO> studentsCourses = studentsCoursesService.getAllStudentsCourses();
        return new ResponseEntity<>(studentsCourses, HttpStatus.OK);

    }

    @GetMapping("/studentscourses/{id}")
    public ResponseEntity<Object> getStudentsCoursesById(@PathVariable("id") Long id) {
        StudentsCoursesDTO studentsCourses = studentsCoursesService.getStudentsCoursesById(id);
        if (studentsCourses == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(studentsCourses);
    }


}

