package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Calculator calc = new Calculator();

        String answer;
        String math;

        do {
            System.out.print("Введите математичское выражение (пример: 2 + 2): " + " ");
            math = scn.nextLine();
            calc.calculate(math);

            do {
                System.out.println("Хотите продолжить? [да/нет]");
                answer = scn.next();
            } while (!answer.equalsIgnoreCase("да") && !answer.equalsIgnoreCase("нет"));
        } while (answer.equalsIgnoreCase("да"));
    }
}