package com.kiswire.maiatomongo.service;

import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kiswire.maiatomongo.nosql.domain.MongoFda001;

import lombok.RequiredArgsConstructor;

// Dispatcher -> Controller -> Service -> Respository <-> DB
// MongoFda001Service(Ioc해야함)@Component, @RestController, @Repository(생략가능),@Service
@Service  //트렌잭션 시작- 트랜잭션 종료
@RequiredArgsConstructor
public class MongoFda001Service {

	// Ioc에 MongoTemplate 클래스가 이미 로드가 되어있음.
	
	private final MongoTemplate mongoTemplate;
	
	//복잡한 쿼리를 작성하기 위한 함수 만들기
	@Transactional //리플리카셋 세팅이 안되어있기 때문에
	public List<MongoFda001> mFindMachineName(String loc){
		// Criteria란 -> 문자열이 아닌 함수를 통해서 쿼리할 수 있게 해주는 라이브러리
		Criteria c = Criteria.where("machine.loc").is(loc);
		Query query = new Query(c);
		return mongoTemplate.find(query, MongoFda001.class);		
	}
	
	@Transactional //리플리카셋 세팅이 안되어있기 때문에
	public List<MongoFda001> mFindMachineId(Long id){
		// Criteria란 -> 문자열이 아닌 함수를 통해서 쿼리할 수 있게 해주는 라이브러리
		Criteria c = Criteria.where("machine.id").is(id);
		Query query = new Query(c);
		return mongoTemplate.find(query, MongoFda001.class);		
	}
	
	
}
