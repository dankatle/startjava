package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
	private int firsNumber;
	private String sign;
	private int secondNumber;

	public void calculate(String math) {
		firsNumber = Integer.parseInt(math.split(" ") [0]);
		sign = math.split(" ") [1];
		secondNumber = Integer.parseInt(math.split(" ") [2]);

		switch (sign) {
			case "+":
				System.out.println("Сумма двух чисел равна - " + Math.addExact(firsNumber, secondNumber));
				break;
			case "-":
				System.out.println("Разность двух чисел равна - " + Math.subtractExact(firsNumber, secondNumber));
				break;
			case "*":
				System.out.println("Произведение двух чисел равно - " + Math.multiplyExact(firsNumber, secondNumber));
				break;
			case "/":
				System.out.println("Частное двух чисел равно - " + Math.floorDiv(firsNumber, secondNumber));
				break;
			case "%":
				System.out.println("Остаток от деление равен - " + (firsNumber % secondNumber));
				break;
			case "^":
				System.out.println("Возведение чисел в степень равно - " + Math.pow(firsNumber, secondNumber));
				break;
			default:
				System.out.println("Введите правильный знак математической операции");
		}
	}
}