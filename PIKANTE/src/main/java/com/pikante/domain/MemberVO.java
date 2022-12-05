package com.pikante.domain;

import java.util.Date;

public class MemberVO {
	
	private int number;
	private String name;
	private String position;
	private Date birthday;
	
	public MemberVO(int number, String name, String position, Date birthday) {
		super();
		this.number = number;
		this.name = name;
		this.position = position;
		this.birthday = birthday;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
	
}
