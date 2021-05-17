package com.deepak.springboot;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseDAOImpl implements CourseDAO {
    @Autowired
    EntityManager entityManager;

/*
    @Override
    public List<Course> getAllCourses() {
        System.out.println("---CourseDAOImpl---getAllCourses()-----");
        String sql = "select *from mycourses";

        List<Course> list = entityManager.createNativeQuery(sql, Course.class).getResultList();
        return list;
    }*/


@Override
public List<Course> getAllCourses(){
	System.out.println("---CourseDAOImpl---getAllCourses()-----");
	String sql="select * from mycourses where trainer=?";

	List<Course> list=entityManager.createNativeQuery(sql,Course.class)
			.setParameter(1,"deepak")

			.getResultList();
	 return list;
}

    @Override
    public Course getCourseByCid(int cid) {
        System.out.println("---CourseDAOImpl---getCourseById()-----");
        return entityManager.find(Course.class, cid);
    }

    @Override
    public void addCourse(Course cou) {
        System.out.println("---CourseDAOImpl---addCourse()-----");
        entityManager.persist(cou);
    }

    @Override
    public void updateCourse(Course cou) {
        System.out.println("---CourseDAOImpl---updateCourse()-----");
        entityManager.merge(cou);
    }

    @Override
    public boolean deleteCourse(int cid) {
        System.out.println("---CourseDAOImpl---deleteCourse()-----");
        Course cou = entityManager.find(Course.class, cid);
        boolean found = false;
        if (cou != null) {
            entityManager.remove(cou);
            found = true;
        }
        return found;
    }
}
