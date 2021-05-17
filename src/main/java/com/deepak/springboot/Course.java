package com.deepak.springboot;

import javax.persistence.*;

@Entity
@Table(name = "mycourses")
public class Course {
    @Id
    @Column(name = "cid")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "courseId_generator")
    @SequenceGenerator(name = "courseId_generator", sequenceName =
            "courseId_gen", initialValue = 106, allocationSize = 1)
    private int courseid;
    @Column(name = "cname")
    private String coursename;
    @Column(name = "cost")
    private double cost;
    @Column(name = "duration")
    private int duration;
    @Column(name = "trainer")
    private String trainer;

    public Course() {
        System.out.println("Course-DC");
    }

    public Course(int courseid, String coursename, double cost, int duration, String trainer) {
        this.courseid = courseid;
        this.coursename = coursename;
        this.cost = cost;
        this.duration = duration;
        this.trainer = trainer;
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }
}



