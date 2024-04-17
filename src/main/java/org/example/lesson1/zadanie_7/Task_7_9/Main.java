package org.example.lesson1.zadanie_7.Task_7_9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String[] CARD_FACES = {"Diamonds", "Clubs", "Hearts", "Spades"};
    private static final String[] CARD_VALUES = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public static void main(String[] args) {
        List<Card> cards = generateDeck();
        Deck deck = new Deck(cards);
        deck.displayDeck(deck.getCards());

        System.out.println("----------------");
        deck.shuffleCard(deck.getCards());
        deck.displayDeck(deck.getCards());

        Card randomCard = deck.getRandomCard(deck.getCards());
        System.out.println("Random card is: " + randomCard.getValue() + " " + randomCard.getFace());

        Card lastCard = deck.getLastCard(deck.getCards());
        System.out.println("The last car is: " + lastCard.getValue() + " " + lastCard.getFace());
    }

    public static List<Card> generateDeck() {
        List<Card> cards = new ArrayList<>();
        for (String value : CARD_VALUES) {
            for (String face : CARD_FACES) {
                cards.add(new Card(value, face));
            }
        }
        return cards;
    }


}
