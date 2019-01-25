package com.danbury;

public class Main {

    public static void main(String[] args) {
        String hello = "Hello";
        String space = " ";
        String world = "World";
        char exclamation = '!';
        System.out.println(hello+space+world+exclamation);

        String numberString = "250.05";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString += myInt + 120.47;
        System.out.println(lastString);
    }
}
