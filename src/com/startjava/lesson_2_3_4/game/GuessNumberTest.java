package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Игроки, перед началом игры введите свои имена");

		Player p1 = new Player(scn.nextLine());
		System.out.println("Первый игрок ввел свое имя - " + p1.getName());
		System.out.println("Второй игрок, теперь ваша очередь");

		Player p2 = new Player(scn.nextLine());
		System.out.println("Второй игрок ввел свое имя - " + p2.getName());

		String answer;
		GuessNumber guess = new GuessNumber(p1, p2);

		do {
			guess.startGame();
			
			do {
				System.out.println("Хотите продолжить? [да/нет]");
				answer = scn.next();
			} while (!answer.equalsIgnoreCase("да") && !answer.equalsIgnoreCase("нет"));
		} while (answer.equalsIgnoreCase("да"));

		System.out.println("Игра окончена!");
	}
}