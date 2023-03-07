/*
    Main class runs BlackJack through the Game class
*/

public class Main {

    public static void main(String[] args) {
        Game newGame = new Game();
    }
}

/*  Old Code (for my reference):
    static Card newCard = new Card(Value.King, Suit.Spades);
    static Shoe newShoe = new Shoe();
    static User user = new User();
    PlayerHand hand = new PlayerHand();
    hand.getRandomCard(newShoe);
    hand.getRandomCard(newShoe);
    System.out.println(hand);
    System.out.println("Hand total is: " + hand.totalPoints());
*/