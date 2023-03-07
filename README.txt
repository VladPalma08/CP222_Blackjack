"Terminal Blackjack" INSTRUCTIONS:

- Find and run the "Main" class.
- You will then be prompted to enter a name and the game will begin.
- Both you and The Dealer will be given two cards, but the Dealer's second card is hidden
- It your choice to either enter (1) Hit or (2) Stand depending on the cards you are handed
- The game continues with you or The Dealer Hitting and or Standing until:
     (1) A player goes over 21. (2) You outscore The Dealer. (3) Both you and The Dealer draw.
     (4) You or The Dealer hits until either attains five cards without busting.
     (5) You indicate that you wish to stop playing.

Extra Rules:
- If you are near reaching a Bust and you pull an Ace, then the Ace (was 11 points) will only count as 1 point.
- Each number card is worth its original value.
- Every face card (kings, queens, jacks) are worth 10 points.
- An Ace is worth 11 points, besides the condition above.


ASSIGNMENT REFLECTION:
Reflect on the process of planning and then building the program:
  - Planning began in class with my seatmates. However, when coding alone, my ideas spiraled out of control.
    Quite honestly, the UML diagram came up much later when my struggles were mostly sorted out. Though, for
    the most part, I knew what classes I wanted to implement. It wasn't so different from everyone else in class, really.

Which parts of the design plan did you end up changing during implementation,and why?
  - Other than the Interface I mention later, I had quite large aspirations for the AI side of my program. I initially
    planned on implementing the option to have multiple players, but I realized it was more difficult that I imagined.
    Other than that, my original plans didn't stray too far from my final project. Though, I wish I had taken more time
    to make the terminal more appealing.

Which data structures did you use to store information? Why did you choose them, and did they end up working as you expected?
  - Enums were a surprise for the most part. Prior to our lecture, I hadn't heard of them. Ben created a Card example
    in class and luckily its implementation in my code was smooth. Though, creating the major classes were a little difficult.
    Player was originally an interface as you can see in the "old_build" ZIP folder. I couldn't make it work and that was
    evident in my many compiler issues. I took advice from my peers to make it an abstract class instead. Otherwise, the other
    classes were fairly straightforward.

What parts of the implementation were harder or easier than you had anticipated?
  - Implementing the User and Dealer classes into the Game class was the most difficult task. There were always errors that
    popped up, and they were mostly a result of me losing track of the subclasses. One class built off another and that made
    it confusing to navigate their methods and attributes. My biggest takeaway was to fully understand the game, how it
    functions and its rules. For the longest time, BlackJack was a lot more complicated my head. I struggled to code the
    output and specific turns I wanted. Turns out the game is a lot simpler, and that was a relief.


Coding Sources:
https://kevinsguides.com/guides/code/java/javaprojs/consoleblackjack
https://stackoverflow.com/questions/7833689/java-string-new-line
https://codehs.com/sandbox/apcsa/the-blackjack-game?filepath=Hand.java
https://codehs.com/sandbox/jkeesh/java-user-input-scanner