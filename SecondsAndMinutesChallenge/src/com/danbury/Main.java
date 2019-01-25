package com.danbury;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(61 * 60));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) return "Invalid value";

        int hours = minutes / 60;
        int remainingMin = minutes % 60;

        String zeroInHours = hours < 10 ? "0" + hours : "" + hours;
        String zeroInMin = remainingMin < 10 ? "0" + remainingMin : "" + remainingMin;
        String zeroInSec = seconds < 10 ? "0" + seconds : "" + seconds;

        return zeroInHours + "h " + zeroInMin + "m " + zeroInSec + "s";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) return "Invalid value";

        int minutes = seconds / 60;
        int remainingSec = seconds % 60;

        return getDurationString(minutes, remainingSec);
    }
}
