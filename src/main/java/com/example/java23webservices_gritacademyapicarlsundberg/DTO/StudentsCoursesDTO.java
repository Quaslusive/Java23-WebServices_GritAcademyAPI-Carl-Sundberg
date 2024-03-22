package com.example.java23webservices_gritacademyapicarlsundberg.DTO;

import lombok.Data;

import java.util.List;

@Data
public class StudentsCoursesDTO {

    private Long id;
    StudentsDTO students;
    CoursesDTO courses;


}
