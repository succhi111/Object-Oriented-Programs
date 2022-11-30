package com.bridgelabz;

import java.util.Random;

public class DeckOfCards {
    String[] Clubs = {"C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9",
            "C10", "CJack", "CQueen", "CKing", "CAce"};

    String[] Diamonds = {"D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9",
            "D10", "DJack", "DQueen", "DKing", "DAce"};

    String[] Hearts = {"H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9",
            "H10", "HJack", "HQueen", "HKing", "HAce"};

    String[] Spades = {"S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9",
            "S10", "SJack", "SQueen", "SKing", "SAce"};

    String[][] deck = {Clubs, Diamonds, Hearts, Spades};

    void distribute() {
        for (int i = 1; i <=4; i++) {
            System.out.println("For Player:- " + i);
            for (int j = 1; j <=9; j++) {
                selectCard();
            }
        }
    }

    void selectCard() {
        Random random = new Random();
        int suit = random.nextInt(4);
        int rank = random.nextInt(13);
        System.out.println(deck[suit][rank]);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Deck of Cards Program");
        DeckOfCards obj = new DeckOfCards();
        obj.distribute();
    }
}