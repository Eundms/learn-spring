package com.learn.spring;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class IsolationTestService {

	private final TransactionTestRepository repository;

	public IsolationTestService(TransactionTestRepository repository) {
		this.repository = repository;
	}

	@Transactional(isolation = Isolation.READ_UNCOMMITTED)
	public void readUnCommittedInsert(String data) {
		repository.save(new TransactionTestEntity(data));
	}

	@Transactional(isolation = Isolation.READ_COMMITTED)
	public void readCommittedInsert(String data) {
		repository.save(new TransactionTestEntity(data));
	}

	@Transactional(isolation = Isolation.REPEATABLE_READ)
	public void repeatableReadCheck() {
	}

	@Transactional(isolation = Isolation.SERIALIZABLE)
	public void serializableCheck() {
	}

}
