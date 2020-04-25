import java.util.Scanner;

public class CalculatorTest {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Calculator calc = new Calculator();
		String answer;
		
		do {
			System.out.println("Введите первое число");
			int firstNumber = scn.nextInt();
			System.out.println("Введено первое число: " + firstNumber);

			System.out.println("Введите знак математической операции");
			char d = scn.next().charAt(0);
			System.out.println("Введен знак математичкой операции " + d);

			System.out.println("Введите второе число");
			int secondNumber = scn.nextInt();
			System.out.println("Введено второе число: " + secondNumber);

			calc.startCalculator(firstNumber, d, secondNumber);

			System.out.println("Хотите продолжить? [да/нет]");
			answer = scn.next();
		} while (answer.equalsIgnoreCase("да"));
	}
}