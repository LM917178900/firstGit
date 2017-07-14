package org.framestudy.sm.beans;

import java.io.Serializable;

public class MonitorBean implements Serializable {

	private Long id;
	private String monitorName;
	private Integer age;
	private String gender;
	private ClassBean clas;
	
	
	public MonitorBean(Long id, String monitorName, Integer age, String gender, ClassBean clas) {
		super();
		this.id = id;
		this.monitorName = monitorName;
		this.age = age;
		this.gender = gender;
		this.clas = clas;
	}
	public ClassBean getClas() {
		return clas;
	}
	public void setClas(ClassBean clas) {
		this.clas = clas;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMonitorName() {
		return monitorName;
	}
	public void setMonitorName(String monitorName) {
		this.monitorName = monitorName;
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
	@Override
	public String toString() {
		return "MonitorBean [id=" + id + ", monitorName=" + monitorName + ", age=" + age + ", gender=" + gender
				+ ", clas=" + clas + "]";
	}
	public MonitorBean(Long id, String monitorName, Integer age, String gender) {
		super();
		this.id = id;
		this.monitorName = monitorName;
		this.age = age;
		this.gender = gender;
	}
	public MonitorBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
