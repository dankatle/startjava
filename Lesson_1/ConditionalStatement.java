public class ConditionalStatement {
	
	public static void main(String[] args) {
		int age = 24;
		if (age > 20) {
			System.out.println("Больше 20 лет");
		}

		boolean maleGender = true;
		if (maleGender) {
			System.out.println("Ты мужского пола");
		}

		if (!maleGender) {
			System.out.println("Ты женского пола");
		}

		double height = 2.01;
		if (height < 1.80) {
			System.out.println("Твой рост меньше 1.80 м.");
		} else {
			System.out.println("Твой рост больше 1.80 м.");
		}

		char firstLetterName = 'I';
		if (firstLetterName == 'M') {
			System.out.println("Первая буква твоего имени - M");
		} else if (firstLetterName == 'I') {
			System.out.println("Первая буква твоего имени - I");
		} else {
			System.out.println("Мы не знаем точно, какая первая буква твоего имени");
		}
	}
}