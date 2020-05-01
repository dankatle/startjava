package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
	private Player p1;
	private Player p2;
	private int randomNumber = (int) (1 + Math.random() * 100);
	private Scanner scan = new Scanner(System.in);

	public GuessNumber(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public void startGame() {
		System.out.println("Игра началась");

		for (int i = 0; i < 10; i++) {
			do {
				System.out.println("У вас осталось " + (10 - i) + " попыток");

				inputNumber(p1, i);
				if (compareNumbers(p1, i)) break;

				inputNumber(p2, i);
				if (compareNumbers(p2, i)) break;
			} while (attemptsEnd(p1, i) && attemptsEnd(p2, i));
		}
		printEnteredNumbers(p1);
		printEnteredNumbers(p2);
		p1.ClearArr();
		p2.ClearArr();
	}

	private void inputNumber(Player player, int i) {
		System.out.println(player.getName() + " введите число");
		player.setEnteredNumber(scan.nextInt());
		int count = 0;
		count++;
	}

	private boolean compareNumbers(Player player, int i) {
		if (player.getLastEnteredNumber() < randomNumber) {
			System.out.println(player.getName() + ", ваше число меньше того, которое загадал компьюетр");
			return false;
		} else if(player.getLastEnteredNumber() > randomNumber) {
			System.out.println(player.getName() + ", ваше число больше того, которое загадал компьюетр");
			return false;
		} else {
			System.out.println("Игрок " + player.getName() + " угадал число " + player.getLastEnteredNumber() + " с " + i + " попытки");
			return true;
		}
	}

	private boolean attemptsEnd(Player player, int i) {
		System.out.println(player.getName() + ", у вас закончились попытки");
		return i != 10;
	}

	private void printEnteredNumbers(Player player) {
		System.out.println(player.getName() + " назвал цифры: " + Arrays.toString(player.getEnteredNumbers()));
	}
}