package com.learn.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TransactionPropagationTest {

	@Autowired
	private PropagationTestService propagationService;

	@Autowired
	private TransactionTestRepository repository;
	@Test
	void testPropagation_() {
		propagationService.requiredTransaction("requiredTransaction");
	}

}

