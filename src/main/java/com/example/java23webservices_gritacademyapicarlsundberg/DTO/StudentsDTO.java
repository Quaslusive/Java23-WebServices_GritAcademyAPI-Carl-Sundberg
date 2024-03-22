package com.example.java23webservices_gritacademyapicarlsundberg.DTO;

import lombok.*;

import java.util.List;

@Data

public class StudentsDTO {

    private long id;
    private String fName;
    private String lName;
    private String town;

    List<CoursesDTO> courses;


}
