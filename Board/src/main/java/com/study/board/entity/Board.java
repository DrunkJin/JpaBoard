package com.study.board.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter // 모든 멤버 변수의 모든 getter메서드를 생성해주는 롬복의 강력한 기능
@NoArgsConstructor(access = AccessLevel.PROTECTED) // access속성을 이용해서 동일한 패키지 내의 클래스에서만 객체를 생성할 수 있도록 제어함
@Entity // 해당 클래스가 테이블과 매핑되는 JPA의 Entity 클래스임을 의미함. 테이블명과 클래스명이 다를경우에는 @Table을 선언하고 name을 괄호안에 넣음. user_role이라는 테이블의 경우 UserRole의 이름으로 네이밍하면됨
@Table(name="jpa_board")
public class Board {
	
	@Id  // PK 의미 보통 MySQL DB는 PK를 bigint, Entity는 Long타입으로 선언함.
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment를 지원하기 위한 어노테이션. 오라클의 경우에는 GenerationType.SEQUENCE. AUTO의 경우는 DB에서 제공하는 PK생성전략을 가져옴
	private Long id; //PK
	
	private String title; // 제목
	
	private String content; //내용
	
	private String writer; //작성자
	
	private int hits; //조회수
	
	private char deleteYn; // 삭제 여부
	
	private LocalDateTime createDate = LocalDateTime.now(); //생성일
	
	private LocalDateTime modifiedDated; // 수정일
	
	@Builder // Lombok 기능. 생성자를 대신하는 놈
	public Board(String title, String content, String writer, int hits, char deleteYn) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.hits = hits;
		this.deleteYn = deleteYn;
	}
}
