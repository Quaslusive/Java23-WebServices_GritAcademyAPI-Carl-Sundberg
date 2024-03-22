package com.example.java23webservices_gritacademyapicarlsundberg.DTO;

import lombok.*;

import java.util.List;

@Data
public class CoursesDTO {

    private long id;
    private String name;
    private String description;
List<StudentsDTO> students;


}
