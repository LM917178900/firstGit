package org.framestudy.sm.relationshipmag.service;

import org.framestudy.sm.beans.ClassBean;

public interface IClassService {

	/**
	 * �¿�һ���༶
	 * @param clas
	 * @return
	 */
	public int addClassBeanInfo(ClassBean clas);
	/**
	 * ����һ���೤
	 * @param clas
	 * @return
	 */
	public int addMonitorBeanInfo(ClassBean clas);
	/**
	 * ͨ���༶id��ѯһ���༶����೤
	 * @param id
	 * @return
	 */
	public ClassBean getClassBeanAndMonitorBeanById(Long id); 
	/**
	 * ͨ���༶idɾ��һ���༶����೤
	 * @param id
	 * @return
	 */
	public int deleteClassBeanAndMonitorBeanById(Long id);
	
	/**
	 * ͨ��һ���༶id��ѯ�༶����༶��ѧ����Ϣ
	 * @param id
	 * @return
	 */
	public ClassBean getClassBeanAndStudentBeanById(Long id);
	/**
	 *ͨ���༶idɾ��һ���༶����༶��ѧ����Ϣ
	 * @param id
	 * @return
	 */
	public int deleteClassBeanAndStudentBeanById(Long id);
	/**
	 * Ϊ�ð����ѧ��
	 * @param clas
	 * @return
	 */
	public int addStudentsInfo(ClassBean clas);
	
}
