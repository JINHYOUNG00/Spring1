package com.company.mvc;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.mvc.emp.EmpMapper;
import com.company.mvc.emp.EmpVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")

public class EmpMapperTest {
	@Autowired EmpMapper mapper;
	
//	@Test
	public void test() {
//		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("file:src\\main\\webapp\\WEB-INF\\spring\\root-context.xml");
//		EmpMapper mapper = ctx.getBean(EmpMapper.class);
		
		EmpVO param = new EmpVO();
		param.setEmployeeId("100");
		Map<String, Object> result = mapper.getEmp(param);
//		MAP에서 FIRST NAME만 출력하고싶을때
		System.out.println(result.get("name"));
	}
	@Test
	public void list() {
		// to do
		EmpVO param = new EmpVO();
		param.setDepartmentId("30");
		List<EmpVO> result = mapper.getEmpList(param);
		List<EmpVO> list = mapper.getEmpByDept(new )
		System.out.println(result);
	}
}
