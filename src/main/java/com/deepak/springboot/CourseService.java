package com.deepak.springboot;

import java.util.*;

public interface CourseService{
public List<Course> getAllCourses();
public Course getCourseByCid(int cid);
public void addCourse(Course cou);
public void updateCourse(Course cou);
public boolean deleteCourse(int cid);
}
