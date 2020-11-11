package com.coforge.entity;

import javax.xml.bind.annotation.XmlType;

@XmlType
public class Engine {
	int egineNo;
	int hp;
	int speed;
	public Engine() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Engine(int egineNo, int hp, int speed) {
		super();
		this.egineNo = egineNo;
		this.hp = hp;
		this.speed = speed;
	}
	public int getEgineNo() {
		return egineNo;
	}
	public void setEgineNo(int egineNo) {
		this.egineNo = egineNo;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	

}
