package org.framestudy.sm.beans;

import java.io.Serializable;
import java.util.List;

public class TeacherBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String teacherName;
	private Integer age;
	private String gender;
	private List<ClassBean> classes;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
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
	public List<ClassBean> getClasses() {
		return classes;
	}
	public void setClasses(List<ClassBean> classes) {
		this.classes = classes;
	}
	@Override
	public String toString() {
		return "TeacherBean [id=" + id + ", teacherName=" + teacherName + ", age=" + age + ", gender=" + gender
				+ ", classes=" + classes + "]";
	}
	public TeacherBean(Long id, String teacherName, Integer age, String gender, List<ClassBean> classes) {
		super();
		this.id = id;
		this.teacherName = teacherName;
		this.age = age;
		this.gender = gender;
		this.classes = classes;
	}
	public TeacherBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
