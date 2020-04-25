public class Wolf {
	
	private char gender;
	private String name;
	private float weight;
	private int age;
	private String color;

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 8) {
			System.out.println("Некорректный ввод");
		} else {
			this.age = age;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void go() {
		System.out.println("Вы начали движение!");
	}

	public void sitDown() {
		System.out.println("Вы только что присели");
	}

	public boolean run() {
		System.out.println("Режим бега активирован");
		return true;
	}

	public String howl() {
		return "Wo-wo";
	}

	public boolean hunt() {
		System.out.println("Режим охоты включен!");
		return true;
	}
}