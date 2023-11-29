package org.example;
// testing commit

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        double totalToCheck = 1e7;
        double positiveEvents = 0;

        Poker poker1 = new Poker();
        ArrayList<String> myDeck2;

        double startTime = System.currentTimeMillis();
        for (int i = 0; i < totalToCheck; i++) {
            myDeck2 = poker1.getHand();
            if (Poker.checkStraight(myDeck2)) {
                positiveEvents++;
            }
            if (i == totalToCheck * 0.25) {
                System.out.println("25% complete");
            }
            if (i == totalToCheck * 0.50) {
                System.out.println("50% complete");
            }
            if (i == totalToCheck * 0.75) {
                System.out.println("75% complete");
            }
        }
        double endTime = System.currentTimeMillis();

        System.out.println("Positive Events vs. total to check: " + positiveEvents + "/" + totalToCheck);
        System.out.println("Real Chances : " + positiveEvents/totalToCheck*100 + "%");
        System.out.println("Time to calculate: " + ((endTime-startTime)/1000) + "s");


    }
}