/*
    Suit creates enums of the four card suits, used in Card
*/

public enum Suit {

    // storing each suit's symbol
    Spades("♠"),
    Hearts("♥"),
    Clubs("♣"),
    Diamonds("♦");

    String suit;

    // setting Suit parameters
    Suit(String suit) {
        this.suit = suit;
    }

    // returns symbol assigned to suit
    public String toString() {
        return suit;
        // a missing toString method would not print out the symbol
    }
}

//    public static void main(String[] args)
//    {
//        System.out.println(Suit.Hearts);
//        System.out.println(Suit.Spades);
//        System.out.println(Suit.Diamonds);
//        System.out.println(Suit.Clubs);
//    }