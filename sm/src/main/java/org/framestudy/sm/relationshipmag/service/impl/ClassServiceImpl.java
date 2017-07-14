package org.framestudy.sm.relationshipmag.service.impl;

import javax.annotation.Resource;

import org.framestudy.sm.beans.ClassBean;
import org.framestudy.sm.relationshipmag.dao.IClassDao;
import org.framestudy.sm.relationshipmag.service.IClassService;
import org.springframework.stereotype.Service;
@Service
public class ClassServiceImpl implements IClassService{

	@Resource
	private IClassDao classDaoImpl;
	
	public int addClassBeanInfo(ClassBean clas) {
		// TODO Auto-generated method stub
		return classDaoImpl.addClassBeanInfo(clas);
	}

	public int addMonitorBeanInfo(ClassBean clas) {
		// TODO Auto-generated method stub
		return classDaoImpl.addMonitorBeanInfo(clas);
	}

	public ClassBean getClassBeanAndMonitorBeanById(Long id) {
		// TODO Auto-generated method stub
		return classDaoImpl.getClassBeanAndMonitorBeanById(id);
	}

	public int deleteClassBeanAndMonitorBeanById(Long id) {
		// TODO Auto-generated method stub
		return classDaoImpl.deleteClassBeanAndMonitorBeanById(id);
	}

	@Override
	public ClassBean getClassBeanAndStudentBeanById(Long id) {
		// TODO Auto-generated method stub
		return classDaoImpl.getClassBeanAndStudentBeanById(id);
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
