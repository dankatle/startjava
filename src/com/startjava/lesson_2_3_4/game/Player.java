package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] enteredNumbers = new int[10];
    private int attempt;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, attempt);
    }

    public void setEnteredNumber(int number) {
        this.enteredNumbers[attempt] = number;
        attempt++;
    }

    public int getLastEnteredNumber() {
        return enteredNumbers[attempt - 1];
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }
}