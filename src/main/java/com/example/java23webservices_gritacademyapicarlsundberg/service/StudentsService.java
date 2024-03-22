package com.example.java23webservices_gritacademyapicarlsundberg.service;

import com.example.java23webservices_gritacademyapicarlsundberg.DTO.CoursesDTO;
import com.example.java23webservices_gritacademyapicarlsundberg.DTO.StudentsDTO;
import com.example.java23webservices_gritacademyapicarlsundberg.entity.Students;
import com.example.java23webservices_gritacademyapicarlsundberg.entity.StudentsCourses;
import com.example.java23webservices_gritacademyapicarlsundberg.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentsService {

    @Autowired
    private StudentsRepository studentsRepository;

    public List<StudentsDTO> getAllStudents() {
        return studentsRepository.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    public StudentsDTO getStudentsById(Long id) {
        return studentsRepository.findById(id).map(this::mapToDTO).orElse(null);
    }

    public List<StudentsDTO> getStudentByFirstName(String fName) {
        return mapStudentsToDTO(studentsRepository.findByfName(fName));
    }

    public List<StudentsDTO> getStudentByLastName(String lName) {
        return mapStudentsToDTO(studentsRepository.findBylName(lName));
    }

    public List<StudentsDTO> getStudentByTown(String town) {
        return mapStudentsToDTO(studentsRepository.findBytown(town));
    }

    public Students addStudent(Students student) {
        return studentsRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentsRepository.deleteById(id);
    }

    private StudentsDTO mapToDTO(Students student) {
        StudentsDTO dto = new StudentsDTO();
        dto.setId(student.getId());
        dto.setFName(student.getFName());
        dto.setLName(student.getLName());
        dto.setTown(student.getTown());
        dto.setCourses(student.getCourses().stream().map(this::mapToDTO).collect(Collectors.toList()));
        return dto;
    }

    private CoursesDTO mapToDTO(StudentsCourses course) {
        CoursesDTO dto = new CoursesDTO();
        dto.setId(course.getCourses().getId());
        dto.setName(course.getCourses().getName());
        dto.setDescription(course.getCourses().getDescription());
        return dto;
    }

    private List<StudentsDTO> mapStudentsToDTO(List<Students> studentsList) {
        return studentsList.stream().map(this::mapToDTO).collect(Collectors.toList());
    }
}
