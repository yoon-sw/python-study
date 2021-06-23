package com.kiswire.fda.web;


import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kiswire.fda.domain.Fda;
import com.kiswire.fda.domain.FdaRepository;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@RestController
public class FdaController {

	private final FdaRepository fdaRepository;
	
	
	@CrossOrigin
	@GetMapping("/fda")
	public List<Fda> findAll(){
		System.out.println("asd");
		return fdaRepository.findAll(PageRequest.of(1, 5)).getContent();
	}
	
	@CrossOrigin
	@GetMapping("/fda/{id}")
	public Fda findById(@PathVariable Long id) {
		System.out.println(id);
		return fdaRepository.mFindById(id);
		//return fdaRepository.findById(id).get();
	}
}

