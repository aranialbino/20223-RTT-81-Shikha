package jpa.entitymodels;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "email", length = 50, nullable = false)
	private String sEmail;

	@Column(name = "name", length = 50, nullable = false)
	private String sName;

	@Column(name = "password", length = 50, nullable = false)
	private String sPassword;

	@ManyToMany(targetEntity = Course.class, fetch = FetchType.EAGER, cascade = (CascadeType.ALL))
	private List<Course> sCourses;

	public Student() {
		this.sName = "";
		this.sPassword = "";
		this.sCourses = new ArrayList<>();
	}

	public Student(String sEmail, String sName, String sPass, List<Course> sCourses) {
		super();
		this.sEmail = sEmail;
		this.sName = sName;
		this.sPassword = sPass;
		this.sCourses = sCourses;

	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsPass() {
		return sPassword;
	}

	public void setsPass(String sPass) {
		this.sPassword = sPass;
	}

	public List<Course> getsCourses() {
		return sCourses;
	}

	public void setsCourses(List<Course> sCourses) {
		this.sCourses = sCourses;
	}

	@Override
	public String toString() {
		return "Student [sEmail=" + sEmail + ", sName=" + sName + ", sPassword=" + sPassword + ", sCourses=" + sCourses
				+ "]";
	}

}
