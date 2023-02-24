/*
    Shoe class creates the randomly generated deck of 52 cards, shuffled
*/

import java.util.*;

// using methods provided during class
public class Shoe {

    // creating an empty list for the deck
    List<Card> cards;

    public Shoe() {
        this.cards = getEmptyCardList();
        addDeckOfCards();
        shuffleCards();
    }

    public Shoe(List<Card> cards) {
        this.cards = cards;
    }

    // empty list for the card assignments below
    List<Card> getEmptyCardList() {
        return new ArrayList<Card>();
    }

    // adding cards to the empty deck
    public void addDeckOfCards() {
        for (Suit suit : Suit.values()) {
            for (Value value : Value.values()) {
                cards.add(new Card(value, suit));
            }
        }
    }

    // places random cards into separate list, shuffles deck
    public void shuffleCards() {
        List<Card> newPile = getEmptyCardList();
        while (cards.size() > 0) {
            Card pickedCard = getRandomCardFromCards();
            newPile.add(pickedCard);
            cards.remove(pickedCard);
        }
        cards = newPile;
    }

    // method to randomize card picking
    Card getRandomCardFromCards() {
        Random rand = new Random();
        int index = rand.nextInt(cards.size());
        return cards.remove(index);
    }

    // displaying the deck of cards
    public String toString() {
        String output = "";
        for (Card card : cards) {
            output += card;
            output += "\n";
        }
        return output;
    }
}