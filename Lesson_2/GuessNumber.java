import java.util.Scanner;

public class GuessNumber {
	Player p1;
	Player p2;

	public GuessNumber(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	void gameStart() {
		Scanner scan = new Scanner(System.in);

		boolean isPlayer1 = false;
		boolean isPlayer2 = false;
		int randomNumber = (int) (1 + Math.random() * 100);

		while (true) {
			System.out.println(p1.getName() + ", введите свое число");
			p1.setNumber(scan.nextInt());
			System.out.println(p1.getName() + " ввел число - " + p1.getNumber());

			System.out.println(p2.getName() + ", введите свое число");
			p2.setNumber(scan.nextInt());
			System.out.println(p2.getName() + " ввел число - " + p2.getNumber());

			if (p1.getNumber() == randomNumber) {
				isPlayer1 = true;
			} else if (p2.getNumber() == randomNumber) {
				isPlayer2 = true;
			}
			if (isPlayer1 == true || isPlayer2 == true) {
				System.out.println("У нас появился победитель");
				System.out.println(p1.getName() + " угадал? " + isPlayer1);
				System.out.println(p2.getName() + " угадал? " + isPlayer2);
				break;
			} else {
				System.out.println("Попробуйте еще раз");
				System.out.println("Компьютер загадал числор " + randomNumber);
				break;
			}
		}
	}
}