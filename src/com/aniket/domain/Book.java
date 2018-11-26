package com.aniket.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "book")
public class Book {

	String name;
	int serialNumber;
	
	public Book() {
	}
	public Book(String name, int serialNumber) {
		super();
		this.name = name;
		this.serialNumber = serialNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
}
