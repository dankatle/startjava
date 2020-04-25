import java.util.Scanner;

public class CalculatorTest {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Calculator calc = new Calculator();
		String answer;
		do {
			do {
				System.out.println("Введите первое число");
				int firstNumber = scn.nextInt();
				System.out.println("Введено первое число: " + firstNumber);

				System.out.println("Введите знак математической операции");
				char sign = scn.next().charAt(0);
				System.out.println("Введен знак математичкой операции " + sign);

				System.out.println("Введите второе число");
				int secondNumber = scn.nextInt();
				System.out.println("Введено второе число: " + secondNumber);

				calc.calculate(firstNumber, sign, secondNumber);

				System.out.println("Хотите продолжить? [да/нет]");
				answer = scn.next();
			} while (answer.equalsIgnoreCase("да"));

			if (!"да".equalsIgnoreCase(answer) && !"нет".equalsIgnoreCase(answer)){
				System.out.println("Хотите продолжить? [да/нет]");
				answer = scn.next();
			} 
		} while (answer.equalsIgnoreCase("да"));
	}
}