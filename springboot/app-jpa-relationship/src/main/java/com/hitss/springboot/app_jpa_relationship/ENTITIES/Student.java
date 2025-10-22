package com.hitss.springboot.app_jpa_relationship.ENTITIES;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "students")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ig;

    @Column(length = 50, nullable = false)
    private String name;
    
    @Column(length = 50, nullable = false)
    private String lastname;

    public Student(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
        name = "tbl_students_courses",
        joinColumns = @JoinColumn(name = "id_student"),
        inverseJoinColumns = @JoinColumn(name = "id_course"),
        uniqueConstraints = @UniqueConstraint(columnNames = {"id_student", "id_course"})
    )
    private Set<Course> courses;

    public Student(){
        this.courses = new HashSet<>();
    }
}
