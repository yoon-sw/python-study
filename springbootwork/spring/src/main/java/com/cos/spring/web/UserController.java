package com.cos.spring.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.spring.domain.User;
import com.cos.spring.domain.UserRepository;
import com.cos.spring.test.Animal;
import com.cos.spring.test.CMResponse;
import com.cos.spring.test.Dog;
import com.cos.spring.test.Tiger;

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
	private final UserRepository userRepository;
	
	@GetMapping("/home/{id}")
	public CMResponse home(@PathVariable int id) {
		System.out.println(animal.getName());
		System.out.println(dog.getName());
		
		
		if(id ==1) {
			CMResponse<User> cm = new CMResponse();
			User user = new User(); 
			user.setUsername("sdfa");
			user.setPassword("2234");
			user.setEmail("sdf@sdfa.sdf");
			cm.setData(user);
			return cm;
		}else {
			CMResponse<Integer> cm = new CMResponse();
			cm.setData(5);
			return cm;
			
		}
	}

	
	// User 정보 저장	(Post)
	@PostMapping("/user")
	public User save(@RequestBody User user) {
		
		System.out.println("save 함수: "+user);
		
		//1. DB에 저장
		User userEntity = userRepository.save(user); //insert된 오브젝트를 리턴 받는다
		
		return userEntity;
	}
	
	
	
	
	// User 정보를 모두 돌려주는 함수	(Get)
	@GetMapping("/user")
	public String selectAll() {
		return "selectAll ok";
	}
	
	// User 정보중에 하나만 돌려주는 함수	(Get)
	@GetMapping("/user/{id}")
	public User selectOne(@PathVariable int id) {
		System.out.println("selectOne:"+id);
		
		User userEntity = userRepository.findById(id).get();
		return userEntity;
	}
	
	// User 정보를 수정하는 함수	(Put)
	@PutMapping("/user/{id}")
	public String update(@RequestBody User user, @PathVariable int id) {
		System.out.println("update:"+user);
		System.out.println("id:"+id);
		return "update ok";
	}
	
	// User 정보를 삭제하는 함수	(Delete)
	@DeleteMapping("/user/{id}")
	public String delete(@PathVariable int id) {
		return "delete ok";
	}
}
