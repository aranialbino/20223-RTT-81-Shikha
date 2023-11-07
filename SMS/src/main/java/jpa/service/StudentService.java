package jpa.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import jpa.dao.StudentDao;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class StudentService implements StudentDao {

	@Override
	public List<Student> getAllStudents() {
		Session session = HibernateUtil.getSession();
		String hql = "select s from Student s";
		Query<Student> query = session.createQuery(hql, Student.class);
		List<Student> list = query.getResultList();
		session.close();
		return list;

	}

	@Override
	public Student getStudentByEmail(String sEmail) {
		Session session = HibernateUtil.getSession();
		String hql = "from Student where sEmail=?1";
		Query<Student> query = session.createQuery(hql, Student.class);
		query.setParameter(1, sEmail);
		Student student = query.list().get(0);
		HibernateUtil.closeSession(session);
		return student;

	}

	@Override
	public boolean validateStudent(String sEmail, String sPassword) {
		Session session = HibernateUtil.getSession();
		String hql = "select count(*) from Student where sEmail = ?1 and sPassword = ?2";
		Query query = session.createQuery(hql, Student.class);
		query.setParameter(1, sEmail);
		query.setParameter(2, sPassword);
		List list = query.list();
		long size = (long) list.get(0);
		HibernateUtil.closeSession(session);
		return size > 0;

	}

	// DId she create the joined class?

	@Override
	public void registerStudentToCourse(String sEmail, int cId) {
		boolean alreadyRegistered = isStudentAlreadyRegistered(sEmail, cId);

		if (!alreadyRegistered) {
			Session session = HibernateUtil.getSession();
			Transaction transaction = session.beginTransaction();
			String insertQuery = "insert into student_course(student_email, scourses_id)"
					+ " values (:email, :courseId) ";
			Query query = session.createNativeQuery(insertQuery);
			query.setParameter("email", sEmail);
			query.setParameter("courseId", cId);
			query.executeUpdate();
			transaction.commit();
			HibernateUtil.closeSession(session);
		}
	}

	public boolean isStudentAlreadyRegistered(String sEmail, int cId) {
		List<Course> studentCourses = getStudentCourses(sEmail);
		for (Course course : studentCourses) {
			if (cId == course.getcId()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Course> getStudentCourses(String sEmail) {
		Session session = HibernateUtil.getSession();
		String hql = "select sCourses from Student where sEmail=:email";
		Query<Course> query = session.createQuery(hql, Course.class);
		query.setParameter("email", sEmail);
		List<Course> list = query.list();
		HibernateUtil.closeSession(session);
		return list;
	}

}
