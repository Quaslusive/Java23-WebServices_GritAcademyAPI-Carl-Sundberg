package com.example.java23webservices_gritacademyapicarlsundberg.controller;

import com.example.java23webservices_gritacademyapicarlsundberg.DTO.StudentsDTO;
import com.example.java23webservices_gritacademyapicarlsundberg.entity.Students;
import com.example.java23webservices_gritacademyapicarlsundberg.service.StudentsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentsController {

    @Autowired
    StudentsService studentsService;

    @GetMapping(value = "/students", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAllStudents() {
        List<StudentsDTO> students = studentsService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping(value = "/students/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getStudentsById(@PathVariable("id") Long id) {
        StudentsDTO students = studentsService.getStudentsById(id);
        if (students != null) {
            return new ResponseEntity<>(students, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(value = "/students/fname/{fName}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<StudentsDTO> getStudentByFirstName(@PathVariable String fName) {
        return studentsService.getStudentByFirstName(fName);
    }

    @GetMapping(value = "/students/lname/{lName}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<StudentsDTO> getStudentByLastName(@PathVariable String lName) {
        return studentsService.getStudentByLastName(lName);
    }

    @GetMapping(value = "/students/town/{town}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<StudentsDTO> getStudentByTown(@PathVariable String town) {
        return studentsService.getStudentByTown(town);
    }


    @PostMapping(value = "/students/add")
    public ResponseEntity<Students> addStudent(@RequestBody Students student) {
        Students addedStudent = studentsService.addStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedStudent);
    }

    @DeleteMapping("students/del/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        studentsService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }


/*
    @PostMapping("/students/add/{fName}/{lName}/{town}")
    public ResponseEntity<Object> addStudent(@RequestBody Students students) {
        // Logik för att lägga till studenten i databasen
        Students savedStudent = studentsService.addStudent(students);
        return ResponseEntity.ok(savedStudent);
    }



    @DeleteMapping("/students/del/{id}")
    public ResponseEntity<Object> deleteStudent(@PathVariable("id") Long id) {
        // Logik för att ta bort studenten från databasen
        studentsService.deleteStudent(id);
        return ResponseEntity.ok().build();
    }

 */
}
