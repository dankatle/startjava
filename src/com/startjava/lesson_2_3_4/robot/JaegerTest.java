package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
	
	public static void main(String[] args) {
		Jaeger gipsy = new Jaeger("Gipsy Danger", "Mark - 3", "USA", 79.25f, 1.980f, 7, 8, 6, "I-19 Plasmacaster and GD6 Chain Sword", "Street Fighter");
		Jaeger striker = new Jaeger("Striker Eureka", "Mark-5", "Australia", 76.2f, 1.850f, 10, 10, 9, "Assault Mount 3.25 and WMB2x90 AKM Chest launcher", "Dirty Boxer");

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