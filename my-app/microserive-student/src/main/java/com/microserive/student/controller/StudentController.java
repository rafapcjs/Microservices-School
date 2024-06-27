package com.microserive.student.controller;

import com.microserive.student.entities.Student;
import com.microserive.student.service.IStudentService;
import org.bouncycastle.pqc.crypto.util.PQCOtherInfoGenerator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/student")
public class StudentController {


    private final IStudentService studentService;

    public StudentController(IStudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Student student) {
        studentService.save(student);
    }

    @GetMapping("/all")
public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(studentService.findAll()); }


    @GetMapping
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.findById(id));
    }

    @GetMapping("/search-ny-course/{idCourse}")
    public ResponseEntity<?> findByIdCourse(@PathVariable Long idCourse) {
        return ResponseEntity.ok(studentService.findByIdCourse(idCourse));
    }
}