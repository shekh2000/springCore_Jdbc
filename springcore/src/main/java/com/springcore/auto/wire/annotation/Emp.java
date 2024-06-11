package com.springcore.auto.wire.annotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("temp")
	private Address address;

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

//	@Autowired
	public void setAddress(Address address) {
		System.out.println("inside setter");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

//	@Autowired
	public Emp(Address address) {
		super();
		System.out.println("inside constructor");
		this.address = address;
	}
	
}
