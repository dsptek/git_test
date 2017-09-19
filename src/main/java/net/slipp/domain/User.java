package net.slipp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// db랑 연결되는거라는 알려 주기 위해서 @Entity 애노테이션을 사용한다. 
@Entity
public class User {
	@Id
	@GeneratedValue // 자동으로 증가 시켜 준다.
	private Long id;
	
	@Column(nullable=false, length=20)
	private String userId;
	private String password;
	private String name;
	private String email;

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", name=" + name + ", email=" + email + "]";
	}

}