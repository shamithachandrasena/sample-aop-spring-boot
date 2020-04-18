package com.samsl;

import com.samsl.ExecutionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SelectMicroApplicationTests {
	@Autowired
	ExecutionService executionService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testExecutor() {
		System.out.println(executionService.executor());
	}


}
