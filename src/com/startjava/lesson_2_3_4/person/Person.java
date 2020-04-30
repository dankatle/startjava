package com.startjava.lesson_2_3_4.person;

public class Person {

	String name = "John";
	float height = 2.05f;
	float weight = 80f;
	char gender = 'M';

	void go() {
		System.out.println("Начал движение");
	}

	void sitDown() {
		System.out.println("Я присел!");
	}

	boolean run() {
		System.out.println("Бег активирован");
		return true;
	}

	String speak() {
		return "Я умею говорить";
	}

	void learnJava() {
		System.out.println("Я приступили к изучению Java");
	}
}