package com.developpez.rpouiller.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.developpez.rpouiller.bean.Course;
import com.developpez.rpouiller.dao.IListeCourseDAO;

public class ServiceListeCourses implements IServiceListeCourses {
	
	@Autowired
	private IListeCourseDAO dao;

	@Transactional(readOnly=true)
	public List<Course> rechercherCourses() {
		return dao.rechercherCourses();
	}

}
