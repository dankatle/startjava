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
			System.out.println("У вас осталось " + (10 - i) + " попыток");

			inputNumber(p1, i);
			if (compareNumbers(p1, i)) break;
			attemptsEnd(p1, i);

			inputNumber(p2, i);
			if (compareNumbers(p2, i)) break;
			attemptsEnd(p2, i);
		}
		printEnteredNumbers(p1);
		printEnteredNumbers(p2);

		clear(p1);
		clear(p2);

		p1.setAttempt(0);
		p2.setAttempt(0);
	}

	private void inputNumber(Player player, int i) {
		System.out.println(player.getName() + " введите число");
		player.setEnteredNumber(scan.nextInt());
	}

	private boolean compareNumbers(Player player, int i) {
		if (player.getLastEnteredNumber() != randomNumber) {
			if (player.getLastEnteredNumber() > 0) System.out.println(player.getName() + ", ваше число больше того, которое загадал компьюетр");
			if (player.getLastEnteredNumber() < 0) System.out.println(player.getName() + ", ваше число меньше того, которое загадал компьюетр");
		}
		if (player.getLastEnteredNumber() == randomNumber) {
			System.out.println("Игрок " + player.getName() + " угадал число " + player.getLastEnteredNumber() + " с " + i + " попытки");
			return true;
		}
		return false;
	}

	private void attemptsEnd(Player player, int i) {
		if (i == 9) {
			System.out.println(player.getName() + ", у вас закончились попытки");
		}
	}

	private void printEnteredNumbers(Player player) {
		System.out.println(player.getName() + " назвал цифры: " + Arrays.toString(player.getEnteredNumbers()));
	}

	private void clear(Player player) {
		Arrays.fill(player.getEnteredNumbers(), 0, player.getAttempt(), 0);
	}
}