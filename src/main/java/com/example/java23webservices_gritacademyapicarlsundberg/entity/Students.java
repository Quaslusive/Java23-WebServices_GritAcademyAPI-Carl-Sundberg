package com.example.java23webservices_gritacademyapicarlsundberg.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.HashSet;

import java.util.Set;

@Entity(name = "students")
@Table(name = "students")

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Students {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fName")
    private String fName;
    @Column(name = "lName")
    private String lName;
    @Column(name = "town")
    private String town;
    @JsonIgnore
    @OneToMany(mappedBy = "students", fetch = FetchType.LAZY)
    private Set<StudentsCourses> courses = new HashSet<>();



    //TODO Or this??
    /*

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name = "students_courses",
            joinColumns = @JoinColumn(name = "students_id"),
            inverseJoinColumns = @JoinColumn(name = "courses_id")
    )
    private Set<Course> courses = new HashSet<>();
     */

}
