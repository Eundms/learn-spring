package com.learn.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TransactionIsolationTest {

	@Autowired
	private IsolationTestService isolationService;

	@Autowired
	private TransactionTestRepository repository;

	@Test
	void testIsolationLevel_read_committed() {
		isolationService.readCommittedInsert("ReadCommitted");
	}


}

