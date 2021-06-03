package com.cos.spring.test;

import lombok.Data;

@Data
public class CMResponse<T> {
	private T data;
}
