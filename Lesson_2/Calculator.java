public class Calculator {

	public void startCalculator(int a, char sign, int b) {
		int result = 0;
		
		switch (sign) {
			case '+':
				result = a + b;
				System.out.println("Сумма двух чисел равна - " + result);
				break;
			case '-':
				result = a - b;
				System.out.println("Разность двух чисел равна - " + result);
				break;
			case '*':
				result = a * b;
				System.out.println("Произведение двух чисел равно - " + result);
				break;
			case '/':
				result = a / b;
				System.out.println("Частное двух чисел равно - " + result);
				break;
			case '%':
				result = a % b;
				System.out.println("Остаток от деление равен - " + result);
				break;
			case '^':
				int resultPow = 1;
				for (int i = 0; i < b ; i++) {
		 			resultPow *= a;
				}
				System.out.println("Возведение чисел в степень равно - " + resultPow);
			default:
				System.out.println("Введите правильный знак математической операции");
		}
	}
}