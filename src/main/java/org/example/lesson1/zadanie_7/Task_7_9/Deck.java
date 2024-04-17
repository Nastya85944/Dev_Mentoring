package org.example.lesson1.zadanie_7.Task_7_9;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {

    private List<Card> cards;

    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public void shuffleCard(List<Card> cards){
        Collections.shuffle(cards);
    }

    public Card getRandomCard(List<Card> cards){
        Random random = new Random();
        int index =  random.nextInt(cards.size());
        return cards.get(index);
    }

    public Card getLastCard(List<Card> cards){
        return cards.get(cards.size() - 1);
    }

    public void displayDeck(List<Card> cards){
        for (Card card: cards){
            System.out.println(card.getValue() + " " + card.getFace());
        }
    }
}
