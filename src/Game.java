/*
    Game is the largest class, facilitating the Dealer and User's moves
    Assigns both the Dealer and User their cards
    Initiates the Game, restarts when needed
*/

import java.util.Scanner;

public class Game {

    private Shoe mainDeck, discardedDeck;
    // discardDeck is a temporary pile of cards, mostly unused because rounds end so quickly

    private Dealer dealer;
    private User user;

    public Game() {
        // creating separate card piles
        mainDeck = new Shoe();

        // creating the two player classes
        dealer = new Dealer();
        user = new User();

        startGame();
    }

    private void startGame() {

        // assigning the Dealer two cards
        dealer.getHand().getRandomCard(mainDeck);
        dealer.getHand().getRandomCard(mainDeck);

        // assigning the User two cards
        user.getHand().getRandomCard(mainDeck);
        user.getHand().getRandomCard(mainDeck);

        // Dealer starting hand method to not reveal second card
        dealer.getStartingHand();

        user.printPlayerHand();
        System.out.println(user.getPlayerName() + "'s hand is valued at: " + user.printPlayerHandValue());

        // checks if the Dealer attains BlackJack, conditions
        if (dealer.isBlackJack()) {

            dealer.printPlayerHand();
            System.out.println("The Dealer's hand is valued at: " + dealer.printPlayerHandValue());

            if(user.isBlackJack()) {
                System.out.println("Both you and The Dealer have BlackJacks. Push.");
                startGame();
            }
            else {
                System.out.println("The Dealer has reached BlackJack. You lose.");
            }
            restartGame();
        }

        // then checks if the User attains BlackJack, game continues
        if(user.isBlackJack()) {
            System.out.println("You have reached BlackJack. You win.");
            restartGame();
        }

        // five card condition, if either the dealer of player has 5 cards without busting they win
        if (user.getHand().fiveCardCondition()) {
            System.out.println("You have 5 cards in possession without busting. You win.");
            restartGame();
        }
        if (dealer.getHand().fiveCardCondition()) {
            System.out.println("The Dealer has 5 cards in possession without busting. You lose.");
            restartGame();
        }

        // initiating the User's turn, Dealer follows below
        user.turn(mainDeck, discardedDeck);

        // checks if the User has more than 21 points, then bust
        if(user.busted()) {
            System.out.println("You have gone over 21 points. You lose.");
            restartGame();
        }

        // methods for the Dealer turn, printing their hand and hits
        System.out.println("The Dealer's hand is revealed and valued at: " + dealer.printPlayerHandValue());
        dealer.printPlayerHand();
        System.out.println("");

        while(dealer.getHand().totalPoints() < 17) {
            dealer.hit(mainDeck, discardedDeck);
        }

        // winning conditions for the end of each round (draw, win, or lose)
        if(dealer.getHand().totalPoints() > 21) {
            System.out.println("The dealer has gone over 21 points. You win.");
            restartGame();
        }
        else if(user.getHand().totalPoints() > dealer.getHand().totalPoints()) {
            System.out.println("You have more points than the dealer. You win.");
            restartGame();
        }
        else if (dealer.getHand().totalPoints() > user.getHand().totalPoints()) {
            System.out.println("The dealer has more points than you. You lose.");
            restartGame();
        }
        else {
            System.out.println("Both players have reached 21 points. The game ends in a draw.");
            restartGame();
        }
    }

    // restart method prompted for when the current session ends
    public void restartGame() {
        System.out.println("");
        System.out.print("Would you like to continue? (1) Yes or (2) No: ");
        System.out.print("");
        Scanner userInput = new Scanner(System.in);

        if (userInput.nextInt() == 1) {
            System.out.println("");
            // line for separation between old and new session
            System.out.println("―――――――――――――――――――――――――――――――――――" +
                    "―――――――――――――――――――――――――――――――――――――――――――――");
            Game newGame = new Game();
        }
        else {
            System.out.println("Thank you for playing Terminal BlackJack. Come again soon.");
            System.exit(0);
        }
        System.out.println("");
    }
}

