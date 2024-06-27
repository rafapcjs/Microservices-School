package com.microserive.course.service;

import com.microserive.course.entities.Course;
import com.microserive.course.http.response.StudentByCourseResponse;

import java.util.List;

public interface iCourseService {
List<Course>findAll();
Course findById(Long id);
void save (Course course);

    StudentByCourseResponse findByIdCourse(Long idCourse);


}
