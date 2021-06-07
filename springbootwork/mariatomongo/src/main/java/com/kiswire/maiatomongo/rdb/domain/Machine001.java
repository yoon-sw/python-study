package com.kiswire.maiatomongo.rdb.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name="machine001")
public class Machine001 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(length=20,name = "name")
	private String name;
	
	@Column(length=20,name = "loc")
	private String loc;
	
}
