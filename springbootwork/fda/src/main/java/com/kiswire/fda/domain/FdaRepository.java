package com.kiswire.fda.domain;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;



public interface FdaRepository extends MongoRepository<Fda, String>{

	@Query("{'id'::#{#id}}")
	Fda mFindById(Long id);
	
}
