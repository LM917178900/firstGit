package org.framestudy.sm.relationshipmag.dao.impl;

import javax.annotation.Resource;

import org.framestudy.sm.beans.ClassBean;
import org.framestudy.sm.relationshipmag.dao.IClassDao;
import org.framestudy.sm.relationshipmag.mapper.ClassMapper;
import org.springframework.stereotype.Repository;
@Repository
public class ClassDaoImpl implements IClassDao{

	@Resource
	private ClassMapper cp;
	
	public int addClassBeanInfo(ClassBean clas) {
		// TODO Auto-generated method stub
		return cp.addClassBeanInfo(clas);
	}

	public int addMonitorBeanInfo(ClassBean clas) {
		// TODO Auto-generated method stub
		return cp.addMonitorBeanInfo(clas);
	}

	public ClassBean getClassBeanAndMonitorBeanById(Long id) {
		// TODO Auto-generated method stub
		return cp.getClassBeanAndMonitorBeanById(id);
	}

	public int deleteClassBeanAndMonitorBeanById(Long id) {
		// TODO Auto-generated method stub
		return cp.deleteClassBeanAndMonitorBeanById(id);
	}

	@Override
	public ClassBean getClassBeanAndStudentBeanById(Long id) {
		// TODO Auto-generated method stub
		return cp.getClassBeanAndStudentBeanById(id);
	}

	@Override
	public int deleteClassBeanAndStudentBeanById(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addStudentsInfo(ClassBean clas) {
		// TODO Auto-generated method stub
		return 0;
	}

}
