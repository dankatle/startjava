package com.startjava.lesson_2_3.calculator;

public class Calculator {

	public void calculate(int firstNumber, char sign, int secondNumber) {
		int result = 0;

		switch (sign) {
			case '+':
				result = firstNumber + secondNumber;
				System.out.println("Сумма двух чисел равна - " + result);
				break;
			case '-':
				result = firstNumber - secondNumber;
				System.out.println("Разность двух чисел равна - " + result);
				break;
			case '*':
				result = firstNumber * secondNumber;
				System.out.println("Произведение двух чисел равно - " + result);
				break;
			case '/':
				result = firstNumber / secondNumber;
				System.out.println("Частное двух чисел равно - " + result);
				break;
			case '%':
				result = firstNumber % secondNumber;
				System.out.println("Остаток от деление равен - " + result);
				break;
			case '^':
				int resultPow = 1;
				for (int i = 0; i < secondNumber ; i++) {
		 			resultPow *= firstNumber;
				}
				System.out.println("Возведение чисел в степень равно - " + resultPow);
			default:
				System.out.println("Введите правильный знак математической операции");
		}
	}
}