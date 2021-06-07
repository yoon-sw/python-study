package com.cos.spring.domain.board;



import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

import com.cos.spring.domain.user.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Data
public class Board {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;	
	
	private String title;
	
	@Lob
	private  String content;
	
	@JsonIgnoreProperties({"board","password"})
	@JoinColumn(name="userId")
	@ManyToOne
	private User user;  //순방향 매핑
	
	@CreationTimestamp //save될때 마다 현재시간을 입력해준다
	private Timestamp created;
	
}
