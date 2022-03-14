# JpaBoard
JPA를 활용한 아주 간단한 게시판 만들기

MySQL 세팅
***** MySQL *****
create table jpa_board (
	id bigint not null auto_increment comment 'PK',
    title varchar(100) not null comment '제목',
    content text not null comment '내용',
    writer varchar(20) not null comment '작성자',
    hits int not null comment'조회수',
    delete_yn enum('Y','N') not null comment '삭제 여부',
    created_date datetime not null comment  '생성일',
    modified_data datetime comment '수정일',
    primary key(id)
) comment '게시판';
