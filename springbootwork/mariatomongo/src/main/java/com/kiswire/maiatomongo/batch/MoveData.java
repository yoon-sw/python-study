package com.kiswire.maiatomongo.batch;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kiswire.maiatomongo.nosql.domain.MongoFda001;
import com.kiswire.maiatomongo.nosql.domain.MongoFda001Repository;
import com.kiswire.maiatomongo.rdb.domain.Fda001;
import com.kiswire.maiatomongo.rdb.domain.Fda001Repository;
import com.kiswire.maiatomongo.rdb.domain.Machine001;
import com.kiswire.maiatomongo.rdb.domain.Machine001Repository;

import lombok.RequiredArgsConstructor;

// Service, RestController, Repository, Component
@RequiredArgsConstructor
@Component
public class MoveData {
	
	private final Fda001Repository fda001Repository;
	private final MongoFda001Repository mongoFda001Repository;
	private final Machine001Repository machine001Repository;
	
	//@Scheduled(fixedDelay = 1000)
	public void test() {
		String now = LocalDateTime.now().toString();
		System.out.println("현재시간:"+now);
	}
	//초,분,시간,일,월,주
	@Scheduled(cron = "0 35 15 * * *",zone = "Asia/Seoul") //Cron (OS내장) - 정기적 실행 - Daemon(서버 - 계속실행)
	public void test2() {
		String now = LocalDateTime.now().toString();
		System.out.println("현재시간:"+now);
	}
	
	@Scheduled(cron = "0 37 15 * * *",zone = "Asia/Seoul") 
	public void test3() {
		Fda001 fda001 = fda001Repository.findById(1L).get();
		System.out.println(fda001);
	}
	
	@Scheduled(cron = "0 10 16 * * *",zone = "Asia/Seoul") 
	public void test4() {
		Fda001 fda001 = fda001Repository.findById(4L).get();
		MongoFda001 mf = MongoFda001.builder()
				.id(fda001.getId())
				.fda001R0037(fda001.getFda001R0037())
				.fda001R0038(fda001.getFda001R0038())
				.fda001R0039(fda001.getFda001R0039())
				.fda001R0040(fda001.getFda001R0040())
				.machine(fda001.getMachine())
				.build();
				
		mongoFda001Repository.save(mf);
		
		System.out.println(LocalDateTime.now().toString()+" OK!");
	}
}
