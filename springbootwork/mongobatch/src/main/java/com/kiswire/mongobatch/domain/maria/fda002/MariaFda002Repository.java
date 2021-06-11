package com.kiswire.mongobatch.domain.maria.fda002;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;




public interface MariaFda002Repository extends JpaRepository<MariaFda002, Long>{
	
	List<?> findByPlcR0001TimestampBetween(Timestamp startTime, Timestamp endTime, Pageable pageable);
	List<?> findByPlcR0001TimestampBetween(Timestamp startTime, Timestamp endTime);
}
