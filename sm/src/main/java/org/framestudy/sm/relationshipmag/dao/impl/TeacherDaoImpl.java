package org.framestudy.sm.relationshipmag.dao.impl;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.framestudy.sm.beans.ClassBean;
import org.framestudy.sm.beans.TeacherBean;
import org.framestudy.sm.relationshipmag.dao.ITeacherDao;
import org.framestudy.sm.relationshipmag.mapper.TeacherMapper;
//import org.spring_mybatis.study.relationshipmag.beans.TeacherBean;
//import org.spring_mybatis.study.relationshipmag.dao.ITeacherDao;
//import org.spring_mybatis.study.relationshipmag.mapper.TeacherMapper;
import org.springframework.stereotype.Repository;
@Repository
public class TeacherDaoImpl implements ITeacherDao{

	@Resource
	private TeacherMapper tm;
	
	
	
	//班级与老师的关系，多对多；（三个表联查）
			/**
			 * 通过班级id查询老师和班级
			 * @param id
			 * @return
			 */
			public TeacherBean getTeacherAndClassById(Long id){
				return tm.getTeacherAndClassById(id);
			}



			public ClassBean getClassAndTeacherById(Long id) {
				// TODO Auto-generated method stub
				return tm.getClassAndTeacherById(id);
			};
}
