package com.cos.spring.domain.user;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.cos.spring.domain.board.Board;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Data
public class User {
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;	
	@Column(length=100)
	private String username;
	private String password;
	private String email;
	
	//LAZY : 일단 user만 select하고 나중에 getBoard를 호출할때 Board를 지연 select 해
	@JsonIgnoreProperties({"user","id"})
	@OneToMany(mappedBy = "user",fetch = FetchType.LAZY) //FK의 주인을 알려주는방법 : mappedBy = 주인의 변수명
	private List<Board> board;  //
}
