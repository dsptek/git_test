package net.slipp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// db랑 연결되는거라는 알려 주기 위해서 @Entity 애노테이션을 사용한다. 
@Entity
public class Question {
	@Id
	@GeneratedValue // 자동으로 증가 시켜 준다.
	private Long id;
	
	private String writer;
	private String title;
	private String contents;
	
	// jpa에서는 디롤트 생성자를 만들어 줘야 에러가 나지 않는다.
	public Question() {}
	
	// 생성자
	public Question(String writer, String title, String contents) {
		super();
		this.writer = writer;
		this.title = title;
		this.contents = contents;
	}
	
	
}
