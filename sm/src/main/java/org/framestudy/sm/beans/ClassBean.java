package org.framestudy.sm.beans;

import java.io.Serializable;
import java.util.List;

public class ClassBean implements Serializable{

	private Long id;
	private String className;
	private List<TeacherBean> teachers;
	private MonitorBean monitor;
	private List<StudentBean> students;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public List<TeacherBean> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<TeacherBean> teachers) {
		this.teachers = teachers;
	}
	public MonitorBean getMonitor() {
		return monitor;
	}
	public void setMonitor(MonitorBean monitor) {
		this.monitor = monitor;
	}
	public List<StudentBean> getStudents() {
		return students;
	}
	public void setStudents(List<StudentBean> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "ClassBean [id=" + id + ", className=" + className + ", teachers=" + teachers + ", monitor=" + monitor
				+ ", students=" + students + "]";
	}
	public ClassBean(Long id, String className, List<TeacherBean> teachers, MonitorBean monitor,
			List<StudentBean> students) {
		super();
		this.id = id;
		this.className = className;
		this.teachers = teachers;
		this.monitor = monitor;
		this.students = students;
	}
	public ClassBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	


	
	
	
}
