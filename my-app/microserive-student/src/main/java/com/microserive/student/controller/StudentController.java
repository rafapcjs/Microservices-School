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
public  void saveStudent(@RequestBody Student student){
        studentService.save(student);
}

@GetMapping
public ResponseEntity<?>findById(@PathVariable Long id){
        return ResponseEntity.ok(studentService.findById(id));
    }