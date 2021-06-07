package com.kiswire.maiatomongo.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiswire.maiatomongo.nosql.domain.MongoFda001;
import com.kiswire.maiatomongo.nosql.domain.MongoFda001Repository;
import com.kiswire.maiatomongo.rdb.domain.Machine001;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class MongoFdaController {
	private final MongoFda001Repository mongoFda001Repository;
	
	
	/*****************************************
	 * cmd : mongo
	 * use korea;
	 * db.fda001.find().pretty();
	 ******************************************/	
	@PostMapping("/mongo/001")
	public MongoFda001 save(){
		
		MongoFda001 mf = new MongoFda001();
		mf.setId(3L);
		mf.setFda001R0037("data1");
		mf.setFda001R0038("data2");
		mf.setFda001R0039("data3");
		mf.setFda001R0040("data4");
		
		Machine001 mc = new Machine001();
		mc.setId(1L);
		mc.setName("온도센서 머신");
		mc.setLoc("부산공장");
		
		mf.setMachine(mc);
				
		mongoFda001Repository.save(mf);
		
		//return "mongo save ok";
		return mf;		
		

	}
	
	@GetMapping("/mongo/001")
	public List<MongoFda001> findAll(){
		return mongoFda001Repository.findAll();
	}
}
