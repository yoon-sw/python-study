package com.kiswire.maiatomongo.nosql.domain;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoFda001Repository extends MongoRepository<MongoFda001, String> {

	// 간단한 쿼리만 여기서 작성
	// "{'machine.loc':'부산공장'}"
	@Query("{'machine.loc'::#{#loc}}")
	List<MongoFda001> mFindMachineName(String loc);
}
