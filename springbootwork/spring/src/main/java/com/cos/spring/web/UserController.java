package com.cos.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.spring.test.*;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;


//FC로 등록됨. 그리고 Dispatcher가 관리함
//@AllArgsConstructor  // 모든 변수의 생성자를 만들어준다
@RequiredArgsConstructor  //변수중에 final이 붙은 변수만 생성자를 만들어준다
@RestController
public class UserController {

	//@Autowired
	//final은 변수를 상수화 = 수정불가능한 변수를 만드는 것
	//final은 값이 무조건 초기화 되어야 한다. (heap에 뜨기전에)
	private final Animal animal;
	private final Dog dog;
	private Tiger tiger;
	
	@GetMapping("/home")
	public String home() {
		System.out.println(animal.getName());
		System.out.println(dog.getName());
		return "<h1>home</h1>";
	}

	
	
	
	// User 정보 저장	(Post)
	@PostMapping("/user")
	public String save() {
		return "save ok";
	}
	
	// User 정보를 모두 돌려주는 함수	(Get)
	@GetMapping("/user")
	public String selectAll() {
		return "selectAll ok";
	}
	
	// User 정보중에 하나만 돌려주는 함수	(Get)
	@GetMapping("/user/1")
	public String selectOne() {
		return "selectOne ok";
	}
	
	// User 정보를 수정하는 함수	(Put)
	@PutMapping("/user/1")
	public String update() {
		return "update ok";
	}
	
	// User 정보를 삭제하는 함수	(Delete)
	@DeleteMapping("/user/1")
	public String delete() {
		return "delete ok";
	}
}
