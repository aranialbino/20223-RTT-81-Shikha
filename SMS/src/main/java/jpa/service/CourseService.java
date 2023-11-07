package jpa.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import jpa.dao.CourseDao;
import jpa.entitymodels.Course;

public class CourseService implements CourseDao {

	@Override
	public List<Course> getAllCourses() {
		Session session = HibernateUtil.getSession();
		String hql = "FROM Course";
		Query<Course> query = session.createQuery(hql, Course.class);
		List<Course> list = query.getResultList();
		return list;
	}

}
