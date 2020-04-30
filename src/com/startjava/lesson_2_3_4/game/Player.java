package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int[] enteredNumbers = new int[10];
    private int counter;
    private boolean win;

    public Player(String name) {
        this.name = name;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, counter);
    }

    public void setEnteredNumbers(int i) {
        this.enteredNumbers[i] = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        counter++;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public boolean getWin() {
        return win;
    }
}