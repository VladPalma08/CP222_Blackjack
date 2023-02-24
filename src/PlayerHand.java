/*
    PlayerHand attains cards created from the Shoe class, assigns them to the players
*/

import java.util.ArrayList;

public class PlayerHand {

    // creating the Player's deck of cards
    private ArrayList<Card> hand;

    public PlayerHand() {
        hand = new ArrayList<Card>();
    }

    // takes a card from a specific index, used for testing and the Dealer's first move
    public Card getCard(int index) {
        return hand.get(index);
    }

    // taking a random card from the generated deck of 52 cards
    public void getRandomCard(Shoe cards) {
        hand.add(cards.getRandomCardFromCards());
    }

    // algorithm for getting the total points based on hand
    public int totalPoints() {
        int total = 0;

        for(Card c : hand) {
            total += c.getCardValueNumber();

            // condition if the card pulled is an Ace and the player will bust, the Ace will count as 1 point
            if(c.getCardValueName() == Value.Ace && total > 21) {
                total -= 10;
            }
        }
        return total;
    }

    // returns value when hand size reaches 5 without busting
    public boolean fiveCardCondition() {
        return hand.size() == 5;
    }

    public String toString() {
        String handResult = "";
        for (Card card : hand) {
            handResult += card;
        }
        return handResult;
    }
}

// BlackJack method check below: (I don't know the exact rules of BlackJack)

//    public boolean isBlackJack(Shoe card) {
//        if (totalPoints() == 10 && hand.size() == 2 && card.getRandomCardFromCards().getCardValueName() == Value.Ace
//            && card.getRandomCardFromCards().getCardSuit() == Suit.Clubs
//                || card.getRandomCardFromCards().getCardSuit() == Suit.Spades) {
//            return true;
//        }
//        else {
//            return false;
//        }
//    }

// For old totalPoints method:
//        while(total > 21 && numAces > 0) { // might be what's messing up my code, take note
//            total -= 10;
//            numAces--;
//        }
