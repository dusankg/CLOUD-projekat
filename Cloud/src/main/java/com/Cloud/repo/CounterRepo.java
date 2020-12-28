package com.Cloud.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Cloud.model.Counter;

@Repository
public interface CounterRepo extends JpaRepository<Counter, Long> {

}
