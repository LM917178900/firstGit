package org.framestudy.sm.relationshipmag.service.impl;

import javax.annotation.Resource;

import org.framestudy.sm.beans.ClassBean;
import org.framestudy.sm.beans.TeacherBean;
import org.framestudy.sm.relationshipmag.dao.ITeacherDao;
import org.framestudy.sm.relationshipmag.service.ITeacherService;
//import org.spring_mybatis.study.relationshipmag.beans.TeacherBean;
//import org.spring_mybatis.study.relationshipmag.dao.ITeacherDao;
//import org.spring_mybatis.study.relationshipmag.service.ITeacherService;
import org.springframework.stereotype.Service;
@Service
public class TeacherServiceImpl implements ITeacherService{

	@Resource
	private ITeacherDao teacherDaoImpl;
	
	//班级与老师的关系，多对多；（三个表联查）
			/**
			 * 通过班级id查询老师和班级
			 * @param id
			 * @return
			 */
			public TeacherBean getTeacherAndClassById(Long id){
				return teacherDaoImpl.getTeacherAndClassById(id);
			}

			public ClassBean getClassAndTeacherById(Long id) {
				// TODO Auto-generated method stub
				return teacherDaoImpl.getClassAndTeacherById(id);
			};
}
