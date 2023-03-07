/*
    The User's methods, turning and inputting certain Scanner inputs
    This class originally implemented a "Player" interface
*/

import java.util.Scanner;

public class User extends Player {

    Scanner userDecision = new Scanner(System.in);

    public User() {
        setPlayerName(playerName());
    }

    // input for the User's name, welcomes the User
    public String playerName() {
        System.out.println("");
        System.out.print("Welcome to Terminal BlackJack. Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("");
        return name;
    }

    // turn method to manage the User and Dealer's moves
    public void turn(Shoe mainDeck, Shoe discardedDeck) {

        // int decision to keep track of user input
        int decision = 0;
        boolean turnStatus = true;

        // includes exceptions for when user inputs String values and so on
        while(turnStatus) {
            try {
                // provides user option for movement, Hit or Stand
                System.out.println("");
                System.out.print("Choose wisely: (1) Hit or (2) Stand?: ");
                decision = userDecision.nextInt();
                turnStatus = false;
                System.out.println("");
            }
            catch (Exception e) {
                System.out.print("Invalid input. Please enter either (1) or (2): ");
                userDecision.next();
                System.out.println("");
            }
        }

        // if the user inputs "1", then allow them to Hit
        if (decision == 1) {
            this.hit(mainDeck, discardedDeck);
            if(this.getHand().totalPoints()>20) {
                return;
            }
            else {
                this.turn(mainDeck, discardedDeck);
            }
        }
        // else statement for when the player decides to Stand
        else {
            System.out.println("You have elected to stand. No cards are given to you.");
            System.out.println("");
        }
    }
}
