package com.learn.spring;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PropagationTestService {

	private final TransactionTestRepository repository;

	public PropagationTestService(TransactionTestRepository repository) {
		this.repository = repository;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void requiredTransaction(String data) {
		repository.save(new TransactionTestEntity(data));
	}

	@Transactional(propagation = Propagation.SUPPORTS)
	public void supportsTransaction(String data) {
		repository.save(new TransactionTestEntity(data));
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void requiresNewTransaction(String data) {
		repository.save(new TransactionTestEntity(data));
	}

	@Transactional(propagation = Propagation.MANDATORY)
	public void mandatoryTransaction(String data) {
		repository.save(new TransactionTestEntity(data));
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public void notSupportedTransaction(String data) {
		repository.save(new TransactionTestEntity(data));
	}

	@Transactional(propagation = Propagation.NEVER)
	public void neverTransaction(String data) {
		repository.save(new TransactionTestEntity(data));
	}

	@Transactional(propagation = Propagation.NESTED)
	public void nestedTransaction(String data) {
		repository.save(new TransactionTestEntity(data));
	}
}
