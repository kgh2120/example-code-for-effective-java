package com.qq.samplecodeforej.week6;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestEntity,Integer> {
}
