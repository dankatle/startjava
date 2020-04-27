package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumber {
	private Player p1;
	private Player p2;

	public GuessNumber(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	void startGame() {
		Scanner scan = new Scanner(System.in);
		int randomNumber = (int) (1 + Math.random() * 100);

		while (true); {
			System.out.println(p1.getName() + ", введите свое число");
			p1.setNumber(scan.nextInt());
			System.out.println(p1.getName() + " ввел число - " + p1.getNumber());

			if (p1.getNumber() < randomNumber) {
				System.out.println("Введеное вами число " + p1.getNumber() + " меньше того, которое загадал компьютер");
			} else if (p1.getNumber() > randomNumber) {
				System.out.println("Введеное вами число " + p1.getNumber() + " больше того, которое загадал компьютер");
			} else if (p1.getNumber() == randomNumber) {
				System.out.println("Игрок по имени " + p1.getName() + " победил! " + p1.getName() + " угадал число - " + p1.getNumber());
				break;
			}

			System.out.println(p2.getName() + ", введите свое число");
			p2.setNumber(scan.nextInt());
			System.out.println(p2.getName() + " ввел число - " + p2.getNumber());

			if (p2.getNumber() < randomNumber) {
				System.out.println("Введеное вами число " + p2.getNumber() + " меньше того, которое загадал компьютер");;
			} else if (p2.getNumber() > randomNumber) {
				System.out.println("Введеное вами число " + p2.getNumber() +  " больше того, которое загадал компьютер");
			} else if (p2.getNumber() == randomNumber) {
				System.out.println("Игрок по имени " + p2.getName() + " победил! " + p2.getName() + " угадал число - " + p2.getNumber());
				break;	
			}
			break;
		}
	}
}