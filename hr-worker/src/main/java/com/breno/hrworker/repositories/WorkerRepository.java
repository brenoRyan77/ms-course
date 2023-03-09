package com.breno.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.breno.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
