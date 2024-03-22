package com.example.java23webservices_gritacademyapicarlsundberg.service;

import com.example.java23webservices_gritacademyapicarlsundberg.DTO.CoursesDTO;
import com.example.java23webservices_gritacademyapicarlsundberg.DTO.StudentsDTO;
import com.example.java23webservices_gritacademyapicarlsundberg.entity.Courses;
import com.example.java23webservices_gritacademyapicarlsundberg.entity.Students;
import com.example.java23webservices_gritacademyapicarlsundberg.entity.StudentsCourses;
import com.example.java23webservices_gritacademyapicarlsundberg.repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CoursesService {


    @Autowired
    CoursesRepository coursesRepository;

    public List<CoursesDTO> getAllCourses() {
        return coursesRepository.findAll().stream().map(this::simpleMapToDTO).collect(Collectors.toList());
    }

    public CoursesDTO getCourseById(Long id) {
        return coursesRepository.findById(id).map(this::simpleMapToDTO).orElse(null);
    }

    public List<CoursesDTO> getCoursesByName(String name) {
        return coursesRepository.findByNameContainingIgnoreCase(name)
                .stream().map(this::simpleMapToDTO).collect(Collectors.toList());
    }

    public List<CoursesDTO> getCoursesByDescription(String description) {
        return coursesRepository.findByDescriptionContainingIgnoreCase(description)
                .stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    private StudentsDTO mapToDTO(StudentsCourses student) {
        StudentsDTO dto = new StudentsDTO();
        dto.setId(student.getId());
        dto.setFName(student.getStudents().getFName());
        dto.setLName(student.getStudents().getLName());
        dto.setTown(student.getStudents().getTown());

        return dto;
    }

    private CoursesDTO mapToDTO(Courses course) {
        CoursesDTO dto = new CoursesDTO();
        dto.setId(course.getId());
        dto.setName(course.getName());
        dto.setDescription(course.getDescription());
        dto.setStudents(course.getStudents().stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList()));
        return dto;
    }

    private CoursesDTO simpleMapToDTO(Courses course) {
        CoursesDTO dto = new CoursesDTO();
        dto.setId(course.getId());
        dto.setName(course.getName());
        dto.setDescription(course.getDescription());
        return dto;
    }

}
