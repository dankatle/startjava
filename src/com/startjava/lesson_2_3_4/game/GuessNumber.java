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

			enteredNumbers(p1, i);
			if (p1.getNumber() == randomNumber) {
				System.out.println("Игрок " + p1.getName() + " угадал число " + p1.getNumber() + " с " + i + " попытки");
				sayEnteredNumbers(p1, i);
				break;
			}

			enteredNumbers(p2, i);
			if (p2.getNumber() == randomNumber) {
				System.out.println("Игрок " + p2.getName() + " угадал число " + p2.getNumber() + " с " + i + " попытки");
				sayEnteredNumbers(p2, i);
				break;
			}

			compareNumbers(p1);
			compareNumbers(p2);
		}

		if (p1.getNumber() != randomNumber && p2.getNumber() != randomNumber) {
			System.out.println(p1.getName() + ", у вас закончились попытки");
			System.out.println(p2.getName() + ", у вас закончились попытки");
		}
	}

	private void enteredNumbers(Player player, int a) {
		System.out.println(player.getName() + " введите число");
		player.setNumber(scan.nextInt());
		player.setEnteredNumbers(a);
	}

	private void sayEnteredNumbers(Player player, int a) {
		System.out.print(player.getName() + " назвал цифры: ");
		int[] enteredNumbers = Arrays.copyOf(player.getEnteredNumbers(), a);
		System.out.print(Arrays.toString(enteredNumbers) + " ");
		Arrays.fill(enteredNumbers, 0);
	}

	private void compareNumbers(Player player) {
		if (player.getNumber() < randomNumber) {
			System.out.println(player.getName() + ", ваше число меньше того, которое загадал компьюетр");
		} else if(player.getNumber() > randomNumber) {
			System.out.println(player.getName() + ", ваше число больше того, которое загадал компьюетр");
		}
	}
}