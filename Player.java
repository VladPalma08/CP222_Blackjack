/*
    Player class handles actions and conditions relating to Dealer and User
    Originally an Interface class until problems arose
*/

public abstract class Player {

    private PlayerHand playerHand;
    private String playerName;

    public Player() {
        this.playerHand = new PlayerHand();
        this.playerName = "";
    }

    // method to get a hand of cards to either the user or dealer
    public PlayerHand getHand() {
        return this.playerHand;
    }

    // getting the player's name (will be used for user input)
    public String getPlayerName() {
        return this.playerName;
    }

    // setting the specified player's name
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    // returns the player's current score
    public int printPlayerHandValue() {
        return this.playerHand.totalPoints();
    }

    // returns value when a "Black Jack" is detected
    public boolean isBlackJack() {
        if(this.playerHand.totalPoints() == 21) {
            return true;
        }
        else {
            return false;
        }
    }

    // returns value when a player's total points go over 21
    public boolean busted() {
        return this.getHand().totalPoints() > 21;
    }

    // players exchange turns through hits, picking up a card and revealing them
    public void hit(Shoe mainDeck, Shoe discardedDeck) {
        this.playerHand.getRandomCard(mainDeck);
        System.out.println(this.playerName + " PICKS OUT A CARD:");
        printPlayerHand();

        System.out.println(this.getPlayerName() + "'s hand is valued at: " + this.printPlayerHandValue());
        System.out.println("\n");
    }

    // to display player's hand
    public void printPlayerHand() {
        System.out.println("\nYour Hand: " + "\n" + getHand());
    }
}