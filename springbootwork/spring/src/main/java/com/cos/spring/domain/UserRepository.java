package com.cos.spring.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//loc 메모리 떠야!! @RestController, @Component, @Repository
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
