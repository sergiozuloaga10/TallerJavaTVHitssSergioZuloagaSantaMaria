package com.hitss.springboot.app_jpa_relationship.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hitss.springboot.app_jpa_relationship.ENTITIES.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
