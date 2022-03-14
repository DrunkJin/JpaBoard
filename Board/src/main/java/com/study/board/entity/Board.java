package com.study.board.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter // 모든 멤버 변수의 모든 getter메서드를 생성해주는 롬복의 강력한 기능
@NoArgsConstructor(access = AccessLevel.PROTECTED) // access속성을 이용해서 동일한 패키지 내의 클래스에서만 객체를 생성할 수 있도록 제어함
@Entity
public class Board {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; //PK
	
	private String title; // 제목
	
	private String content; //내용
	
	private String writer; //작성자
	
	private int hits; //조회수
	
	private char deleteYn; // 삭제 여부
	
	private LocalDateTime createDate = LocalDateTime.now(); //생성일
	
	private LocalDateTime modifiedDated; // 수정일
	
	@Builder
	public Board(String title, String content, String writer, int hits, char deleteYn) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.hits = hits;
		this.deleteYn = deleteYn;
	}
}
