package org.framestudy.sm.relationshipmag.dao;

import org.framestudy.sm.beans.ClassBean;
import org.framestudy.sm.beans.TeacherBean;

//import org.spring_mybatis.study.relationshipmag.beans.TeacherBean;

public interface ITeacherDao {

	//�༶����ʦ�Ĺ�ϵ����Զࣻ�����������飩
		/**
		 * ͨ����ʦid��ѯ��ʦ�ͼ���༶
		 * @param id
		 * @return
		 */
		public TeacherBean getTeacherAndClassById(Long id);
		
		/**
		 * ͨ���༶id��ѯ�༶�ͼ�����ʦ
		 * @param id
		 * @return
		 */
		public ClassBean getClassAndTeacherById(Long id);
}
