public class Wolf {
	
	char gender;
	String name;
	float weight;
	int age;
	String color;

	void go() {
		System.out.println("Вы начали движение!");
	}

	void sitDown() {
		System.out.println("Вы только что присели");
	}

	boolean run() {
		System.out.println("Режим бега активирован");
		return true;
	}

	String howl() {
		return "Wo-wo";
	}

	boolean hunt() {
		System.out.println("Режим охоты включен!");
		return true;
	}
}