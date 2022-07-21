package com.company.mvc;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.mvc.dept.DepartmentMapper;
import com.company.mvc.dept.DepartmentVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "src\\main\\webapp\\WEB-INF\\spring\\root-context.xml")
public class BoardMapperTest {
	@Autowired DepartmentMapper mapper;
	
	@Test
	public void list() {
		List<DepartmentVO> result = mapper.getDeptList();
		System.out.println(result);
	}
	
	
}
