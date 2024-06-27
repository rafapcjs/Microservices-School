package com.microserive.course.persintecie;

import com.microserive.course.entities.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface     ICourseRepository extends CrudRepository<Course,Long> {



}
