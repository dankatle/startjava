package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
	private int firstNumber;
	private String sign;
	private int secondNumber;

	public void calculate(String math) {
		String[] mathExpression = math.split(" ");
		firstNumber = Integer.parseInt(mathExpression[0]);
		sign = mathExpression[1];
		secondNumber = Integer.parseInt(mathExpression[2]);

		switch (sign) {
			case "+":
				System.out.println("Сумма двух чисел равна - " + Math.addExact(firstNumber, secondNumber));
				break;
			case "-":
				System.out.println("Разность двух чисел равна - " + Math.subtractExact(firstNumber, secondNumber));
				break;
			case "*":
				System.out.println("Произведение двух чисел равно - " + Math.multiplyExact(firstNumber, secondNumber));
				break;
			case "/":
				System.out.println("Частное двух чисел равно - " + Math.floorDiv(firstNumber, secondNumber));
				break;
			case "%":
				System.out.println("Остаток от деление равен - " + (firstNumber % secondNumber));
				break;
			case "^":
				System.out.println("Возведение чисел в степень равно - " + Math.pow(firstNumber, secondNumber));
				break;
			default:
				System.out.println("Введите правильный знак математической операции");
		}
	}
}