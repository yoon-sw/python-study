package com.cos.spring.web;

import java.util.List;
import java.util.function.Supplier;

import javax.security.auth.x500.X500Principal;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.spring.domain.user.LoginDTO;
import com.cos.spring.domain.user.User;
import com.cos.spring.domain.user.UserRepository;
import com.cos.spring.handler.CustomException;
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
	public List<User> selectAll() {
		List<User> users = userRepository.findAll(); 
		return users; //자바 오브젝트를 리턴하면 자동으로 JSON으로 변경하여 리턴해준다
	}
	
	// User 정보중에 하나만 돌려주는 함수	(Get)
	@GetMapping("/user/{id}")
	public User selectOne(@PathVariable int id) {
		System.out.println("selectOne:"+id);
				
		//1. DB에서 select하고
		//2. 결과응답하기
		//3. 옵셔널-빈객체리턴 -> orElse, 절대 빈객체 아니다 -> get(), 예외 던질 수 있다 -> orElseThrow
		// 4.자바 1.8람다식
		User userEntity = userRepository.findById(id).orElseThrow(() -> {
			return new CustomException("selectOne : 아이디를 잘못 입력하였습니다.");			
		});

		
		return userEntity;  //스프링이 자바 Objec를 Json으로 변환
	}
	
	// User 정보를 수정하는 함수	(Put)
	@PutMapping("/user/{id}")
	public User update(@RequestBody User user, @PathVariable int id) {

		User userEntity = userRepository.findById(id).orElseThrow(() -> new CustomException("update: 수정할 아이디를 못찾음"));
		
		userEntity.setUsername(user.getUsername());
		userEntity.setPassword(user.getPassword());
		userEntity.setEmail(user.getEmail());
		
		userRepository.save(userEntity);  //id 넣으면 디비에 그 아이디 있으면 수정, 없으면 인서트
		
		return userEntity;
	}
	
	// User 정보를 삭제하는 함수	(Delete)
	@DeleteMapping("/user/{id}")
	public String delete(@PathVariable int id) {
		
		try {
			userRepository.deleteById(id);
		}catch(Exception e) {
			throw new CustomException("delete:삭제할 아이디를 찾을수 없습니다");
		}
		
		return "delete ok";
	}
	
	//select * from user where username=? and password = ?;
	// http1.1 방식에서 로그인 요청은 무조건 post (password정보때문)
	@PostMapping("/user/login")
	public String login(@RequestBody LoginDTO loginDTO) {
		System.out.println("loginDTO:"+loginDTO);
		
		userRepository.mLogin(loginDTO.getUsername(), loginDTO.getPassword())
			.orElseThrow(() -> new CustomException("login: 아이디와 패스워드를 잘못 입력"));
		return "ok";
	}
	
	// Restful API 주소방식 : GET:/테이블명/where절
	// select * from user where username=? ;
	@GetMapping("user/check/{username}")
	public String usernameDuplicateCheck(@PathVariable String username) {
		userRepository.mUsernameDuplicateCheck(username)
			.orElseThrow(() -> new CustomException("usernameDuplicateCheck: 중복된 사용자 없음"));
		return "중복된 사용자 있음";
	}
	
}
