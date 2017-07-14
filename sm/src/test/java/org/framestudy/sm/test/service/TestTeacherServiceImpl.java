package org.framestudy.sm.test.service;

import javax.annotation.Resource;

import org.framestudy.sm.beans.ClassBean;
import org.framestudy.sm.beans.TeacherBean;
import org.framestudy.sm.relationshipmag.service.ITeacherService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
//import org.spring_mybatis.study.relationshipmag.beans.TeacherBean;
//import org.spring_mybatis.study.relationshipmag.service.ITeacherService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestTeacherServiceImpl {

	@Resource
	ITeacherService teacherServiceImpl;
	
	//测试方法没有参数，吊用方法有参数；
	@Ignore
	public void TestGetTeacherAndClassById(){
		TeacherBean teacher=teacherServiceImpl.getTeacherAndClassById(1l);
		System.out.println(teacher); 
	};
	@Test
	public void TestgetClassAndTeacherById(){
		ClassBean clas=teacherServiceImpl.getClassAndTeacherById(1l);
		System.out.println(clas);
	};
	
	
	
}
