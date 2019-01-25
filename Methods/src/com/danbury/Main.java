package com.danbury;

public class Main {

    public static void main(String[] args) {

//        int highScore = calculateScore(true, 5000, 5, 100);

//        System.out.println(highScore);

//        highScore = calculateScore(false, 10000, 8, 200);

//        System.out.println(highScore);

        displayHighScorePosition("Dan", calculateHighScorePosition(1500));
        displayHighScorePosition("Emit", calculateHighScorePosition(900));
        displayHighScorePosition("Race", calculateHighScorePosition(400));
        displayHighScorePosition("Vinni", calculateHighScorePosition(50));
    }

//    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        int finalScore = -1;
//        if (gameOver) {
//            finalScore = score + (levelCompleted * bonus);
//            finalScore += 1000;
//        }
//        return finalScore;
//    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        if (score > 1000) return 1;
        if (score > 500) return 2;
        if (score > 100) return 3;
        return 4;
    }
}
