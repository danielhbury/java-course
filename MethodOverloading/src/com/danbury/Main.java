package com.danbury;

public class Main {

    public static void main(String[] args) {
//        System.out.println("New score is " + calculateScore("Tim", 500));
//
//        System.out.println(calculateScore(75));
//
//        System.out.println(calculateScore());

        System.out.println(calcFeetAndInchesToCentimeters(222));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) return -1;
        return (feet * 12 * 2.54) + (inches * 2.54);
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) return -1;
        double remainder = inches%12;
        double feet = (inches/12) - (remainder/12);
        return calcFeetAndInchesToCentimeters(feet, remainder);
    }

//    public static int calculateScore(String playerName, int score) {
//        System.out.println("Player " + playerName + " scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore(int score) {
//        System.out.println("Unnamed player scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore() {
//        System.out.println("No player name, no player score");
//        return 0;
//    }
}
