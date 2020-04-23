public class Calculator {

	public static void main(String[] args) {
		int a = 34;
		int b = 2;
		int result = 0;
		char sign = '/';

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
			for (int i = 0; i < b ; i++) {
				result = a * a;
			}
			System.out.println("Возведение чисел в степень равно - " + result);
		} else {
			System.out.println("Невозможно выполнить данную операцию");
		}
	}
}