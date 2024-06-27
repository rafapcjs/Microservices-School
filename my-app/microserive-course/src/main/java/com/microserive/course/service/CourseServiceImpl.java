package com.microserive.course.service;

import com.microserive.course.client.StudentClient;
import com.microserive.course.dto.StudentDto;
import com.microserive.course.entities.Course;
import com.microserive.course.http.response.StudentByCourseResponse;
import com.microserive.course.persintecie.ICourseRepository;

import java.util.List;

public class CourseServiceImpl implements iCourseService{

private  final ICourseRepository iCourseRepository;


    private final StudentClient studentClient;

    public CourseServiceImpl(ICourseRepository iCourseRepository, StudentClient studentClient) {
        this.iCourseRepository = iCourseRepository;
        this.studentClient = studentClient;
    }

    @Override
    public List<Course> findAll() {
        return (List<Course>) iCourseRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return iCourseRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Course course) {
iCourseRepository.save(course);
    }

    @Override
    public StudentByCourseResponse findByIdCourse(Long idCourse) {

       //  consultar el curso si existe

        Course course =iCourseRepository.findById(idCourse).orElse(new Course());

      // obtiene los estuddiannte del curso
        List<StudentDto>studentDtoList=studentClient.findAllStudentBYCourse(idCourse);



        return StudentByCourseResponse.builder()

                .courseName(course.getName())
                .teacher(course.getTeacher())

                .studentDtoList(studentDtoList)
                .build();
    }
}
