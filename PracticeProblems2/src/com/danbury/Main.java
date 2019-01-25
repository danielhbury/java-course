package com.danbury;

public class Main {

    public static void main(String[] args) {
//        System.out.println(area(5.0));
//        System.out.println(area(-1));
//        System.out.println(area(5.0, 4.0));
//        System.out.println(area(-1.0, 4.0));

//        printYearsAndDays(525600);
//        printYearsAndDays(1051200);
//        printYearsAndDays(561600);

//        printEqual(1, 1, 1);
//        printEqual(1, 1, 2);
//        printEqual(-1, -1, -1);
//        printEqual(1, 2, 3);

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer && (temperature < 25 || temperature > 45)) return false;
        if (!summer && (temperature < 25 || temperature > 35)) return false;
        return true;
    }

//    public static void printEqual(int x, int y, int z) {
//        if (x < 0 || y < 0 || z < 0) {
//            System.out.println("Invalid value");
//        } else if (x == y && x == z) {
//            System.out.println("All numbers are equal");
//        } else if (x != y && x != z && y != z) {
//            System.out.println("All numbers are different");
//        } else {
//            System.out.println("Neither all are equal or different");
//        }
//    }

//    public static void printYearsAndDays(long minutes) {
//        if (minutes < 0) {
//            System.out.println("Invalid Value");
//        } else {
//
//
//            long days = minutes / 60 / 24;
//            long remainDays = days % 365;
//            long years = days / 365;
//
//            System.out.println(minutes + " min = " + years + " y and " + remainDays + " d");
//        }
//    }

//    public static double area(double radius) {
//        if (radius < 0) return -1.0;
//
//        return radius * radius * 3.14159;
//    }
//
//    public static double area(double x, double y) {
//        if (x < 0 || y < 0) return -1.0;
//
//        return x * y;
//    }
}
