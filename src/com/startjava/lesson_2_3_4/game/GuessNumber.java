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

		clearEnteredNumbers(p1);
		clearEnteredNumbers(p2);

		p1.setWin(false);
		p2.setWin(false);

		for (int i = 0; i < 10; i++) {
			System.out.println("У вас осталось " + (10 - i) + " попыток");

			inputNumbers(p1, i);
			compareNumbers(p1, i);
			if (p1.getWin()) break;

			inputNumbers(p2, i);
			compareNumbers(p2, i);
			if (p2.getWin()) break;
		}

		printEnteredNumbers(p1);
		printEnteredNumbers(p2);
	}

	private void inputNumbers(Player player, int i) {
		System.out.println(player.getName() + " введите число");
		player.setNumber(scan.nextInt());
		player.setEnteredNumbers(i);
	}

	private void printEnteredNumbers(Player player) {
		System.out.println(player.getName() + " назвал цифры: " + Arrays.toString(player.getEnteredNumbers()));
	}

	private void clearEnteredNumbers(Player player) {
		Arrays.fill(player.getEnteredNumbers(), 0);
	}
	private void compareNumbers(Player player, int i) {
		if (player.getNumber() == randomNumber) {
			System.out.println("Игрок " + player.getName() + " угадал число " + player.getNumber() + " с " + i + " попытки");
			player.setWin(true);
		} else if(player.getNumber() > randomNumber) {
			System.out.println(player.getName() + ", ваше число больше того, которое загадал компьюетр");
		} else if (player.getNumber() < randomNumber) {
			System.out.println(player.getName() + ", ваше число меньше того, которое загадал компьюетр");
		}

		if (i == 10) {
			System.out.println(player.getName() + ", у вас закончились попытки");
		}
	}
}