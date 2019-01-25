package com.danbury;

public class Main {

    public static void main(String[] args) {

//        printMegaBytesAndKiloBytes(2050);

//        System.out.println(bark(true,1));
//        System.out.println(bark(false,2));
//        System.out.println(bark(true,8));
//        System.out.println(bark(true,-1));

//        System.out.println(isLeapYear(-1600));
//        System.out.println(isLeapYear(1600));
//        System.out.println(isLeapYear(2017));
//        System.out.println(isLeapYear(2000));

//        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
////        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
////        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));

//        System.out.println(hasEqualSum(1,1,1));
//        System.out.println(hasEqualSum(1,1,2));
//        System.out.println(hasEqualSum(1,-1,0));

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        if (num1 >= 13 && num1 <= 19) return true;
        if (num2 >= 13 && num2 <= 19) return true;
        if (num3 >= 13 && num3 <= 19) return true;
        return false;
    }

//    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
////
////        if (kiloBytes < 0) {
////
////            System.out.println("Invalid Value");
////
////        } else {
////
////            int calcMB = kiloBytes/1024;
////
////            int calcKB = kiloBytes%1024;
////
////            System.out.println(kiloBytes + " KB = " + calcMB + " MB and " + calcKB + " KB");
////
////        }
////
////    }

//    public static boolean bark(boolean barking, int hourOfDay) {
//        if (!barking || hourOfDay < 0 || hourOfDay > 23) return false;
//        if (hourOfDay < 8 || hourOfDay > 22) {
//            return true;
//        }
//        return false;
//    }

//    public static boolean isLeapYear(int year) {
//        if (year < 1 || year > 9999) return false;
//        if ((year%4 == 0 && year%100 != 0) || year%400 == 0) return true;
//        return false;
//    }

//    public static boolean areEqualByThreeDecimalPlaces(double dub1, double dub2) {
//        if (dub1*1000 - dub1*1000%1 == dub2*1000 - dub2*1000%1) {
//            return true;
//        }
//        return false;
//    }

//    public static boolean hasEqualSum(int num1, int num2, int num3) {
//        if (num1 + num2 == num3) return true;
//        return false;
//    }
}
