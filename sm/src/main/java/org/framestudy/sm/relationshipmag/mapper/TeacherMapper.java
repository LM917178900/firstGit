package org.framestudy.sm.relationshipmag.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.framestudy.sm.beans.ClassBean;
import org.framestudy.sm.beans.TeacherBean;
//import org.spring_mybatis.study.relationshipmag.beans.TeacherBean;

public interface TeacherMapper {

	//班级与老师的关系，多对多；（三个表联查）
			/**
			 * 通过老师id查询老师和老师管理的班级集合
			 * @param id 老师id
			 * @return
			 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="teacherName",column="teacher_name",javaType=String.class),
		@Result(property="age",column="age",javaType=Integer.class),
		@Result(property="gender",column="gender",javaType=String.class),
		@Result(property="classes",column="id",javaType=List.class,many=@Many
		(fetchType=FetchType.LAZY,select="getClassesByTeacherId"))
	})
	@Select("select * from t_teacher where id = #{id}")
			public TeacherBean getTeacherAndClassById(Long id);
	
	
	@ResultType(ClassBean.class)
	@Select("select id as id,class_name as className from t_class where id in "
			+ "(SELECT c.id FROM t_class as c RIGHT JOIN t_junction as j ON c.id=j.fk_class_id RIGHT JOIN t_teacher as t ON t.id=j.fk_teacher_id WHERE t.id=#{id})")
	public ClassBean getClassesByTeacherId(Long id);
	
	/**
	 * 通过班级id查询班级和及其老师
	 * @param id
	 * @return
	 */
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="className",column="class_name",javaType=String.class),
		@Result(property="teachers",column="id",javaType=List.class,many=@Many
		(fetchType=FetchType.LAZY,select="getTeachersByClassId"))
	})
	@Select("select * from t_class where id=#{id}")
	public ClassBean getClassAndTeacherById(Long id);	
	
	
	
	@ResultType(TeacherBean.class)
	@Select("SELECT id as id,teacher_name as teacherName,age as age,gender as gender FROM t_teacher WHERE id IN "
			+ "(SELECT t_teacher.id FROM t_teacher RIGHT JOIN t_junction ON t_teacher.id=t_junction.fk_teacher_id RIGHT JOIN t_class ON t_class.id=t_junction.fk_class_id WHERE t_class.id=#{id})	")
	public TeacherBean getTeachersByClassId(Long id);
	
	
	
	
}



