package com.example.java23webservices_gritacademyapicarlsundberg.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "students_courses")
@Table(name = "students_courses")

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class StudentsCourses {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  //  @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
  //  @JoinColumn(name = "studentsId")
    @JoinColumn(name = "students_id")
    Students students;

    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "coursesId")
    @JoinColumn(name = "courses_id")
    Courses courses;

}
