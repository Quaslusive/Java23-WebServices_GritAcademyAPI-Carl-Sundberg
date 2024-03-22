package com.example.java23webservices_gritacademyapicarlsundberg.service;

import com.example.java23webservices_gritacademyapicarlsundberg.DTO.CoursesDTO;
import com.example.java23webservices_gritacademyapicarlsundberg.DTO.StudentsCoursesDTO;
import com.example.java23webservices_gritacademyapicarlsundberg.DTO.StudentsDTO;
import com.example.java23webservices_gritacademyapicarlsundberg.entity.Courses;
import com.example.java23webservices_gritacademyapicarlsundberg.entity.Students;
import com.example.java23webservices_gritacademyapicarlsundberg.entity.StudentsCourses;
import com.example.java23webservices_gritacademyapicarlsundberg.repository.CoursesRepository;
import com.example.java23webservices_gritacademyapicarlsundberg.repository.StudentsCoursesRepository;
import com.example.java23webservices_gritacademyapicarlsundberg.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentsCoursesService {

    @Autowired
    StudentsCoursesRepository studentsCoursesRepository;


    public List<StudentsCoursesDTO> getAllStudentsCourses() {
        return studentsCoursesRepository.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    public StudentsCoursesDTO getStudentsCoursesById(Long id) {
        return studentsCoursesRepository.findById(id).map(this::mapToDTO).orElse(null);
    }


    private CoursesDTO mapToDTO(Courses course) {
        CoursesDTO dto = new CoursesDTO();
        dto.setId(course.getId());
        dto.setName(course.getName());
        dto.setDescription(course.getDescription());


        return dto;
    }
    private StudentsDTO mapToDTO(Students student) {
        StudentsDTO dto = new StudentsDTO();
        dto.setId(student.getId());
        dto.setTown(student.getTown());
        dto.setFName(student.getFName());
        dto.setLName(student.getLName());

        return dto;
    }

    private StudentsCoursesDTO mapToDTO(StudentsCourses courses) {
        StudentsCoursesDTO dto = new StudentsCoursesDTO();
        dto.setId(courses.getId());
        dto.setCourses(mapToDTO(courses.getCourses()));
        dto.setStudents(mapToDTO(courses.getStudents()));
        return dto;
    }
}
