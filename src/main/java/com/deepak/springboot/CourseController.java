package com.deepak.springboot;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/allcourses")
    public List<Course> getAllCourses() {
        System.out.println("---CourseController---getAllCourses()-----");
        return courseService.getAllCourses();
    }

    @GetMapping("/mycourse/{cid}")
    public Course getCourseByCname(@PathVariable int cid) {
        System.out.println("---CourseController---getCourseByCid()-----");
        return courseService.getCourseByCid(cid);
    }

    @PostMapping("addCourse")
    //@RequestMapping(value = "addCourse",method = RequestMethod.POST)
    public Course addCourse(@RequestBody Course mycou) {
        System.out.println("--------CourseController----addCourse()-----");
        courseService.addCourse(mycou);
        return mycou;
    }

    @PutMapping("updateCourse")
    public String updateCourse(@RequestBody Course mycou) {
        System.out.println("-------CourseController-----updateCourse()-----");
        courseService.updateCourse(mycou);
        String msg = "Course Updated successfully";
        return msg;
    }

    @DeleteMapping("/deleteCourse/{cid}")
    public boolean deleteCourseByCid(@PathVariable int cid) {
        System.out.println("--------CourseController----deleteCourseByCid()-----");
        return courseService.deleteCourse(cid);
    }
}