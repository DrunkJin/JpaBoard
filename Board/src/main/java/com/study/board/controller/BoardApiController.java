package com.study.board.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.board.dto.BoardRequestDto;
import com.study.board.dto.BoardResponseDto;
import com.study.board.model.BoardService;

@RestController
@RequestMapping("/api")
public class BoardApiController {
	
	private final BoardService boardService = null;
	/**
	 * 게시글 생성
	 */
	@PostMapping("/boards")
	public Long save(@RequestBody final BoardRequestDto params) {
		return boardService.save(params);
	}
	
	/**
	 * 게시글 리스트 조회
	 */
	@GetMapping("/boards")
	public List<BoardResponseDto> findAll() {
		return boardService.findAll();
	}
	
	/**
	 * 게시글 수정
	 */
	@PatchMapping("/boards/{id}")
	public Long save(@PathVariable final Long id, @RequestBody final BoardRequestDto params) {
		return boardService.update(id, params);
	}
}
