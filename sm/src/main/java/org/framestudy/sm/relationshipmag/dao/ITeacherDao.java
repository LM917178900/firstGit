package org.framestudy.sm.relationshipmag.dao;

import org.framestudy.sm.beans.ClassBean;
import org.framestudy.sm.beans.TeacherBean;

//import org.spring_mybatis.study.relationshipmag.beans.TeacherBean;

public interface ITeacherDao {

	//班级与老师的关系，多对多；（三个表联查）
		/**
		 * 通过老师id查询老师和及其班级
		 * @param id
		 * @return
		 */
		public TeacherBean getTeacherAndClassById(Long id);
		
		/**
		 * 通过班级id查询班级和及其老师
		 * @param id
		 * @return
		 */
		public ClassBean getClassAndTeacherById(Long id);
}
