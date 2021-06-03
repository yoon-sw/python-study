package com.cos.spring.domain.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//loc 메모리 떠야!! @RestController, @Component, @Repository
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Query(value="SELECT * FROM user WHERE username=:username AND password=:password", nativeQuery = true)
	Optional<User> mLogin(String username, String password);
	
	@Query(value="SELECT * FROM user WHERE username=:username", nativeQuery = true)
	Optional<User> mUsernameDuplicateCheck(String username);
}
