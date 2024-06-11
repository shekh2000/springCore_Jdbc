package com.springcore.stereotype;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Component("student1")
@Scope("prototype")
public class Student {
	@Value("Deepak")
	private String studentname;
	@Value("jaipur")
	private String city;
	@Value("#{temp}")
	private List<String> address;
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Student [studentname=" + studentname + ", city=" + city + ", address=" + address + "]";
	}
	
}
