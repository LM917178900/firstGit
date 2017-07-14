package org.framestudy.sm.relationshipmag.service;

import org.framestudy.sm.beans.ClassBean;

public interface IClassService {

	/**
	 * 新开一个班级
	 * @param clas
	 * @return
	 */
	public int addClassBeanInfo(ClassBean clas);
	/**
	 * 设置一个班长
	 * @param clas
	 * @return
	 */
	public int addMonitorBeanInfo(ClassBean clas);
	/**
	 * 通过班级id查询一个班级及其班长
	 * @param id
	 * @return
	 */
	public ClassBean getClassBeanAndMonitorBeanById(Long id); 
	/**
	 * 通过班级id删除一个班级及其班长
	 * @param id
	 * @return
	 */
	public int deleteClassBeanAndMonitorBeanById(Long id);
	
	/**
	 * 通过一个班级id查询班级及其班级的学生信息
	 * @param id
	 * @return
	 */
	public ClassBean getClassBeanAndStudentBeanById(Long id);
	/**
	 *通过班级id删除一个班级及其班级的学生信息
	 * @param id
	 * @return
	 */
	public int deleteClassBeanAndStudentBeanById(Long id);
	/**
	 * 为该班添加学生
	 * @param clas
	 * @return
	 */
	public int addStudentsInfo(ClassBean clas);
	
}
