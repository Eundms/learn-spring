package com.learn.spring;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionTestRepository extends JpaRepository<TransactionTestEntity, Long> {
}
