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
	
	
	
	//�༶����ʦ�Ĺ�ϵ����Զࣻ�����������飩
			/**
			 * ͨ���༶id��ѯ��ʦ�Ͱ༶
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
