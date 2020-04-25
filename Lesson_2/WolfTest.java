public class WolfTest {
	
	public static void main(String[] args) {
		Wolf wolf = new Wolf();
		wolf.gender = 'M';
		wolf.name = "Borz";
		wolf.weight = 8.6F;
		wolf.age = 5;
		wolf.color = "black";

		System.out.println("Пол - " + wolf.gender);
		System.out.println("Кличка - " + wolf.name);
		System.out.println("Вес - " + wolf.weight);
		System.out.println("Возраст - " + wolf.age);
		System.out.println("Цвет - " + wolf.color);

		wolf.go();
		wolf.sitDown();
		wolf.run();
		wolf.howl();
		wolf.hunt();
	}
}