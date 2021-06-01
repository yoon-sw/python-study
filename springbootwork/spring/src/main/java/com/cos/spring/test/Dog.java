package com.cos.spring.test;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Dog {
	private String name = "강아지";
	private String color = "개색";
}
