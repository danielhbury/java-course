package com.danbury;

public class Main {

    public static void main(String[] args) {
      byte myByte = 127;
      short myShort = 2000;
      int myInt = 300000;
      long myLong = 50000L + (10L * (myByte + myShort + myInt));
      System.out.println(myLong);
    }
}
