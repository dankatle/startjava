public class Calculator {

	public static void main(String[] args) {
		int a = 34;
		int b = 4;
		int result = 0;
		char sign = '^';

		if (sign == '+') {
			result = a + b;
			System.out.println("Сумма двух чисел равна - " + result);
		} else if (sign == '-') {
			result = a - b;
			System.out.println("Разность двух чисел равна - " + result);
		} else if (sign == '*') {
			result = a * b;
			System.out.println("Произведение двух чисел равно - " + result);
		} else if (sign == '/') {
			result = a / b;
			System.out.println("Частное двух чисел равно - " + result);
		} else if (sign == '%') {
			result = a % b;
			System.out.println("Остаток от деление равен - " + result);
		} else if (sign == '^') {
			int resultPow = 1;
			for (int i = 0; i < b ; i++) {
				resultPow = resultPow * a;
			}
			System.out.println("Возведение чисел в степень равно - " + resultPow);
		} else {
			System.out.println("Невозможно выполнить данную операцию");
		}
	}
}