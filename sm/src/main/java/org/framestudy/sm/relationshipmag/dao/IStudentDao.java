package org.framestudy.sm.relationshipmag.dao;

public interface IStudentDao {

	//添加一个学生（在。。班）
	//删除一个学生
	//修改学生所在班级（）
	/**
	 * 通过学生id查询一个学生及其所在班级信息
	 * @return
	 */
	public int findStudentAndClassById();
	
	
}
