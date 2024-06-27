package com.microserive.course.controller;

import com.microserive.course.entities.Course;
import com.microserive.course.service.CourseServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    private final CourseServiceImpl courseService;

    public CourseController(CourseServiceImpl courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Course Course) {
        courseService.save(Course);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(courseService.findAll());
    }


    @GetMapping("findByID/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(courseService.findById(id));
    }

    @GetMapping("/search-student/{idCourse}")
    public ResponseEntity<?> findStudentByCourse(@PathVariable Long idCourse) {
        return ResponseEntity.ok(courseService.findByIdCourse(idCourse));
    }


}