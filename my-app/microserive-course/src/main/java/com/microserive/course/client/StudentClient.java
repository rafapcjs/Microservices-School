package com.microserive.course.client;

import com.microserive.course.dto.StudentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "msvc-student", url = "localhost:8090/api/student")
public interface StudentClient {
    @GetMapping("/search-ny-course/{idCourse}")
     List<StudentDto>findAllStudentBYCourse(Long idCourse );
}
