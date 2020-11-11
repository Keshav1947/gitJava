package com.coforge.entity;

import javax.xml.bind.annotation.XmlType;

@XmlType
public class Customer {
	private int Cust_id;
	private String Cust_name;
	private int phone;
	private String address;
	
	public Customer() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Customer(int cust_id, String cust_name, int phone, String address) {
		super();
		Cust_id = cust_id;
		Cust_name = cust_name;
		this.phone = phone;
		this.address = address;
	}

	public int getCust_id() {
		return Cust_id;
	}

	public void setCust_id(int cust_id) {
		Cust_id = cust_id;
	}

	public String getCust_name() {
		return Cust_name;
	}

	public void setCust_name(String cust_name) {
		Cust_name = cust_name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
