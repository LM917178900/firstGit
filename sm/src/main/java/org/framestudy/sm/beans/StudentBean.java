package org.framestudy.sm.beans;

import java.io.Serializable;

public class StudentBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String studentName;
	private Integer age ;
	private String gender;
	private ClassBean clas;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public ClassBean getClas() {
		return clas;
	}
	public void setClas(ClassBean clas) {
		this.clas = clas;
	}
	@Override
	public String toString() {
		return "StudentBean [id=" + id + ", studentName=" + studentName + ", age=" + age + ", gender=" + gender
				+ ", clas=" + clas + "]";
	}
	public StudentBean(Long id, String studentName, Integer age, String gender, ClassBean clas) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.age = age;
		this.gender = gender;
		this.clas = clas;
	}
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
