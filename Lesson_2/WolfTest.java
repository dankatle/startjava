public class WolfTest {
	
	public static void main(String[] args) {
		Wolf wolf = new Wolf();
		wolf.setGender('M');
		wolf.setName("Borz");
		wolf.setWeight(8.88f);
		wolf.setAge(5);
		wolf.setColor("Black");

		System.out.println("Пол - " + wolf.getGender());
		System.out.println("Кличка - " + wolf.getName());
		System.out.println("Вес - " + wolf.getWeight());
		System.out.println("Возраст - " + wolf.getAge());
		System.out.println("Цвет - " + wolf.getColor());

		wolf.go();
		wolf.sitDown();
		wolf.run();
		wolf.howl();
		wolf.hunt();
	}
}