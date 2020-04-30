package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Calculator calc = new Calculator();

        String answer;
        String mathExpression;

        do {
            System.out.print("Введите математичское выражение (пример: 2 + 2): " + " ");
            mathExpression = scn.nextLine();
            calc.calculate(mathExpression);

            do {
                System.out.println("Хотите продолжить? [да/нет]");
                answer = scn.next();
            } while (!answer.equalsIgnoreCase("да") && !answer.equalsIgnoreCase("нет"));
        } while (answer.equalsIgnoreCase("да"));
    }
}