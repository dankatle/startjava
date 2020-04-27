package com.startjava.lesson_2_3.robot;

public class Jaeger {
	
	private String name;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int speed;
	private int strength;
	private int armor;
	private String weapons;
	private String bodyLanguage;

	public Jaeger(String name, String mark, String origin, float height, float weight, int speed, int strength, int armor, String weapons, String bodyLanguage) {
		this.name = name;
		this.mark = mark;
		this.origin = origin;
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strength = strength;
		this.armor = armor;
		this.weapons = weapons;
		this.bodyLanguage = bodyLanguage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public String getWeapons() {
		return weapons;
	}

	public void setWeapons(String weapons) {
		this.weapons = weapons;
	}

	public String getBodyLanguage() {
		return bodyLanguage;
	}

	public void setBodyLanguage(String bodyLanguage) {
		this.bodyLanguage = bodyLanguage;
	}

	boolean shoot() {
		System.out.println("Режим стрельбы включен");
		return true;
	}
}