package com.example.java23webservices_gritacademyapicarlsundberg.controller;

import com.example.java23webservices_gritacademyapicarlsundberg.DTO.CoursesDTO;
import com.example.java23webservices_gritacademyapicarlsundberg.DTO.StudentsDTO;
import com.example.java23webservices_gritacademyapicarlsundberg.service.CoursesService;
import com.example.java23webservices_gritacademyapicarlsundberg.entity.Courses;
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
public class CoursesController {

    @Autowired
    CoursesService coursesService;

    @GetMapping(value = "/courses", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CoursesDTO>> getAllCourses() {
        List<CoursesDTO> courses = coursesService.getAllCourses();
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }
    @GetMapping(value = "/courses/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getCourseById(@PathVariable("id") Long id) {
        CoursesDTO course = coursesService.getCourseById(id);
        if (course == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(course);
    }

    @GetMapping(value = "/courses/name/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CoursesDTO>> getCoursesByName(@PathVariable String name) {
        List<CoursesDTO> courses = coursesService.getCoursesByName(name);
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }

    @GetMapping(value = "/courses/des/{description}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CoursesDTO>> getCoursesByDescription(@PathVariable String description) {
        List<CoursesDTO> courses = coursesService.getCoursesByDescription(description);
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }

}
