package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] enteredNumbers = new int[10];
    private int counter;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, counter);
    }

    public void setEnteredNumber(int number) {
        this.enteredNumbers[counter] = number;
        counter++;
    }

    public int getLastEnteredNumber() {
        return enteredNumbers[counter-1];
    }

    public void ClearArr() {
        Arrays.fill(enteredNumbers, 0);
    }
}