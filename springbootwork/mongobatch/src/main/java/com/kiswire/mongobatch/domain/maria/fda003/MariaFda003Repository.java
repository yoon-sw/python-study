package com.kiswire.mongobatch.domain.maria.fda003;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;




public interface MariaFda003Repository extends JpaRepository<MariaFda003, Long>{
	
	List<?> findByPlcR0001TimestampBetween(Timestamp startTime, Timestamp endTime, Pageable pageable);
	List<?> findByPlcR0001TimestampBetween(Timestamp startTime, Timestamp endTime);
}
