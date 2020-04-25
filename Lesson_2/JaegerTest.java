public class JaegerTest {
	
	public static void main(String[] args) {
		Jaeger gipsy = new Jaeger();

		gipsy.setName("Gipsy Danger");
		gipsy.setMark("Mark - 3");
		gipsy.setOrigin("USA");
		gipsy.setHeight(79.25f);
		gipsy.setWeight(1.980f);
		gipsy.setSpeed(7);
		gipsy.setStrength(8);
		gipsy.setArmor(6);
		gipsy.setWeapons("I-19 Plasmacaster and GD6 Chain Sword");
		gipsy.setBodyLanguage("Street Fighter");

		Jaeger striker = new Jaeger();

		striker.setName("Striker Eureka");
		striker.setMark("Mark-5");
		striker.setOrigin("Australia");
		striker.setHeight(76.2f);
		striker.setWeight(1.850f);
		striker.setSpeed(10);
		striker.setStrength(10);
		striker.setArmor(9);
		striker.setWeapons("Assault Mount 3.25 and WMB2x90 AKM Chest launcher");
		striker.setBodyLanguage("Dirty Boxer");

		System.out.println("Имя егеря gipsy - " + gipsy.getName() + ", Mark - " + gipsy.getMark() + ", происхождение - " + gipsy.getOrigin() + ", рост в м. - " + gipsy.getHeight() + 
			", вес в тоннах - " + gipsy.getWeight() + ", скорость - " + gipsy.getSpeed() + ", сила -  " + gipsy.getStrength() + ", защита - " + gipsy.getArmor() + 
			", оружия - " + gipsy.getWeapons() + ", body language - " + gipsy.getBodyLanguage());
		System.out.println(" ");
		System.out.println("Имя егеря striker - " + striker.getName() + ", Mark - " + striker.getMark() + ", происхождение - " + striker.getOrigin() + ", рост в м. - " + striker.getHeight() + 
			", вес в тоннах - " + striker.getWeight() + ", скорость - " + striker.getSpeed() + ", сила -  " + striker.getStrength() + ", защита - " + striker.getArmor() + 
			", оружия - " + striker.getWeapons() + ", body language - " + striker.getBodyLanguage());

		gipsy.shoot();
		striker.shoot();
	}
}