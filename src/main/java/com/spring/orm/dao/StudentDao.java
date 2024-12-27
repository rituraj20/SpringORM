package com.spring.orm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entities.Student;

public class StudentDao {
	private HibernateTemplate hibernateTemplate;
@Transactional
	public int insert(Student student) {
		Integer i=(Integer)this.hibernateTemplate.save(student);
		return i;
	}
}
