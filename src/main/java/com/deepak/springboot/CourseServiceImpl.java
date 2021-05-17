package com.deepak.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseDAO courseDAO;

    @Override
    public List<Course> getAllCourses() {
        System.out.println("---CourseServiceImpl---getAllCourses()-----");
        return courseDAO.getAllCourses();
    }

    @Override
    public Course getCourseByCid(int cid) {
        System.out.println("---CourseServiceImpl---getCourseById()-----");
        return courseDAO.getCourseByCid(cid);
    }

    @Override
    public void addCourse(Course cou) {
        System.out.println("---CourseServiceImpl---addCourse()-----");
        courseDAO.addCourse(cou);
    }

    @Override
    public void updateCourse(Course cou) {
        System.out.println("---CourseServiceImpl---updateCourse()-----");
        courseDAO.updateCourse(cou);
    }

    @Override
    public boolean deleteCourse(int cid) {
        System.out.println("---CourseServiceImpl---deleteCourse()-----");
        return courseDAO.deleteCourse(cid);
    }
}