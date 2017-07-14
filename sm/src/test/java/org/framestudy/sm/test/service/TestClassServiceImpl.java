package org.framestudy.sm.test.service;

import javax.annotation.Resource;

import org.framestudy.sm.beans.ClassBean;
import org.framestudy.sm.beans.MonitorBean;
import org.framestudy.sm.relationshipmag.service.IClassService;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestClassServiceImpl {
	@Resource
	private IClassService clasServiceImpl;
	@Ignore
	public void testAddClassBeanInfo(){
		ClassBean clas=new ClassBean(null, "t100",null, null,null);
		int rows=clasServiceImpl.addClassBeanInfo(clas);
		
		Assert.assertEquals(1, rows);
		
	};
	@Ignore
	public void testAddMonitorBeanInfo(){
		//mysql中有的数据在java中不一定有；比如new MonitorBean；
		ClassBean clas=new ClassBean(6l, "t100", null,new MonitorBean(1l, "lein", 18, "M"),null);
		int rows=clasServiceImpl.addMonitorBeanInfo(clas);
		Assert.assertEquals(1, rows);
	};
	
	@Ignore
	public void testgetClassBeanAndMonitorBeanById(){
		ClassBean clas=clasServiceImpl.getClassBeanAndMonitorBeanById(5l);
		System.out.println(clas);
	};

	@Ignore
	public void testDeleteClassBeanAndMonitorBeanById(){
		int rows=clasServiceImpl.deleteClassBeanAndMonitorBeanById(5l);
		Assert.assertEquals(1, rows);
	};
	@Test
	public void testGetClassBeanAndStudentBeanById(){
		ClassBean clas=clasServiceImpl.getClassBeanAndStudentBeanById(1l);
		System.out.println(clas);
	};
	
}
