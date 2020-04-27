package com.startjava.lesson_1.game;

public class MyFirstGame {

	public static void main(String[] args) {
		int randomNumber = 82;
		int myNumber = 0;
		do {
			if (myNumber < randomNumber) {
				System.out.println("Введеное вами число меньше того, которое загадал компьютер");
				myNumber++;
			} else if (myNumber > randomNumber) {
				System.out.println("Введеное вами число больше того, которое загадал компьютер");
				myNumber--;
			}
		} while (myNumber != randomNumber);
	   	System.out.println("Вы угадали число");
	}
}