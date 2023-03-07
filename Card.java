/*
    Card class uses attributes of Suit and Value to create card images
*/

public class Card {

    // creating new instances of Value and Suit
    Value value;
    Suit cardSuit;

    public Card(Value cardValue, Suit suit) {
        value = cardValue;
        cardSuit = suit;
    }

    // getting a card's name (kings, queens, jacks, aces)
    public Value getCardValueName() {
        return value;
    }

    // getting a card's number value
    public int getCardValueNumber() {
        return value.cardValue;
    }

    // printing out an image of the cards and their values
    public String toString() {

        // card sizes were off, so conditions were needed to resize them
        if (this.getCardValueNumber() <= 9 && this.getCardValueNumber() > 1) {
            return "╷———————╷ " +
                    "\n│ " + this.getCardValueNumber() + "     │ " +
                    "\n│   " + cardSuit + "   │ " +
                    "\n│     " + this.getCardValueNumber() + " │ " +
                    "\n╵———————╵" +
                    "\nA [" + getCardValueName() + " of " + cardSuit +
                    "] (" + getCardValueNumber() + ")" + "\n";
        }
        else if (this.getCardValueNumber() >= 10) {
            return "╷————————╷ " +
                    "\n│ " + this.getCardValueNumber() + "     │ " +
                    "\n│   " + cardSuit + "    │ " +
                    "\n│     " + this.getCardValueNumber() + " │ " +
                    "\n╵————————╵" +
                    "\nA [" + getCardValueName() + " of " + cardSuit +
                    "] (" + getCardValueNumber() + ")" + "\n";
        }
        return null;
    }
}

// methods required: getCardValueName, getCardValueNumber, getCardSuit
//    public Suit getCardSuit() { return cardSuit; }
