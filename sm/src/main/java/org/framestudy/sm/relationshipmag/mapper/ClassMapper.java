package org.framestudy.sm.relationshipmag.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.FetchType;
import org.framestudy.sm.beans.ClassBean;
import org.framestudy.sm.beans.MonitorBean;
import org.framestudy.sm.beans.StudentBean;

public interface ClassMapper {

	/**
	 * �¿�һ���༶
	 * @param clas
	 * @return
	 */
	@Insert("insert into t_class (class_name) values (#{clas.className})" )
	@Options(useGeneratedKeys=true,keyProperty="clas.id")
	public int addClassBeanInfo(@Param("clas")ClassBean clas);
	/**
	 * ����һ���೤
	 * @param clas
	 * @return
	 */
	@Update("update t_class set fk_monitor_id=#{clas.monitor.id} where id=#{clas.id}")
	public int addMonitorBeanInfo(@Param("clas")ClassBean clas);
	/**
	 * ͨ���༶id��ѯһ���༶����೤
	 * @param id
	 * @return
	 */
	@Results({
		@Result(id=true, property="id", column="id",javaType=Long.class),
		@Result(property="className", column="class_name",javaType=String.class),
		@Result(property="monitor", column="id",javaType=MonitorBean.class,many=@Many
		(fetchType=FetchType.LAZY,select="getMonitorByClassId"))
	})
	
	@Select("select * from t_class where id=#{id}")
	public ClassBean getClassBeanAndMonitorBeanById(Long id); 
	
	@ResultType(MonitorBean.class)
	@Select("select id as id ,monitor_name as monitorName,age as age ,gender as gender from t_Monitor where id "
			+ "=(SELECT fk_monitor_id FROM t_class WHERE id=#{id})")
	public MonitorBean getMonitorByClassId(Long id);
	
	/**
	 * ͨ���༶idɾ��һ���༶����೤
	 * @param id
	 * @return
	 */
	@Delete(value={"delete from t_monitor where id=(SELECT fk_monitor_id FROM t_class WHERE id=#{id});"
			+ "","delete from t_class where id=#{id}"})
	public int deleteClassBeanAndMonitorBeanById(Long id);
	
	/**
	 * ͨ��һ���༶id��ѯ�༶����༶��ѧ����Ϣ
	 * @param id
	 * @return//�˴������⣬javaType=List;
	 */
	@Results({
		@Result(id=true,column="id",property="id",javaType=Long.class),
		@Result(property="className", column="class_name",javaType=String.class),
		@Result(property="students",column="id",javaType=List.class,many=@Many
		(fetchType=FetchType.LAZY,select="getStudentsById"))
	})
	@Select("select * from t_class where id=#{id}")
	public ClassBean getClassBeanAndStudentBeanById(Long id);
	
	@ResultType(StudentBean.class)
	@Select("SELECT id as id ,student_name as studentName,age as age,gender as gender  FROM t_student WHERE id IN "
			+ "(SELECT t_student.id FROM t_student RIGHT JOIN t_class ON t_student.fk_class_id=t_class.id WHERE t_class.id=#{id})")
	public StudentBean getStudentsById(Long id);
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
