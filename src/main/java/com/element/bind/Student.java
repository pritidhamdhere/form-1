package com.element.bind;

import org.springframework.stereotype.Controller;


public class Student {
	
	private String name;
	private String email;
    private String address;
    private int marks;
    private int mobile;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", address=" + address + ", marks=" + marks + ", mobile="
				+ mobile + "]";
	}
    
	

}
