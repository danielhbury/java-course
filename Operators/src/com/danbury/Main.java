package com.danbury;

public class Main {

    public static void main(String[] args) {
        double first = 20;
        double second = 80;
        double result = (first + second) * 25;
        System.out.println(result);
        double remainder = result % 40;

        if (remainder <= 20)
            System.out.println("Total was over the limit");
    }
}
