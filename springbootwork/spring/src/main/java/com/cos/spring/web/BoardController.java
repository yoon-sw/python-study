package com.cos.spring.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.spring.domain.board.Board;
import com.cos.spring.domain.board.BoardRepository;
import com.cos.spring.domain.user.User;
import com.cos.spring.domain.user.UserRepository;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@RestController
public class BoardController {

	private final BoardRepository boardRepository;
	private final UserRepository userRepository;
	
	@PostMapping("/board")
	public String save(@RequestBody Board board) {
		User userEntity = userRepository.findById(1).get();
		board.setUser(userEntity);
		boardRepository.save(board);
		return "save ok";
	}
	
	@GetMapping("/board")
	public List<Board> findAll(){
		return boardRepository.findAll();
	}
}
