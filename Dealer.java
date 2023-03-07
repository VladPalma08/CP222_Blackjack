/*
    Dealer hand extending the Player abstract class
    Originally implemented a "Player" interface class
*/

public class Dealer extends Player {

    // creating the Dealer
    public Dealer() {
        super.setPlayerName("The Dealer");
    }

    // special method for Dealer, first card is shown but not the second
    public void getStartingHand() {
        System.out.println("The Dealer's hand is as shown:");
        System.out.println(super.getHand().getCard(0));
        System.out.println("Their second card is not revealed.");
    }

    // printing the Dealer's hand
    public void printPlayerHand() {
        System.out.println("\nThe Dealer's Hand: " + "\n" + getHand());
    }
}