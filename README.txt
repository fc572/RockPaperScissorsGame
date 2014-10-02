RockPaperScissors
=================

Due to the lack of time, (I know 1 week can be long but not when you have relatives
visiting from Italy) I have done a quick search on the net and I have found this
nice project http://codereview.stackexchange.com/questions/57301/rock-paper-scissors-game-in-java
where the bulk of the game has already been implemented.
Also there is no point in re-inventing the wheel.

Stage 1 - Fix the bugs that are present now while making the code testable.

Also the code has already 1 bug as after the first game this is what happens.

1st BUG: The answer to "Go to score menu" in given as invalid without user interaction

Rock: 1, Paper: 2, Scissor: 3  //1st run prompt user for input
3                              //1st run display user choice
Computer chooses rock          //1st run Informing user of computer choice
Lose                           //1st run display game result
Go to score menu? y/n          //1st run prompt user for score menu
n                              //1st run display user choice
Want to play again? y/n        //1st run prompt user for another game
y                              //1st run display user choice
Rock: 1, Paper: 2, Scissor: 3  //2nd run prompt user for input
1                              //2nd run display user choice
Computer chooses scissor       //2nd run Informing user of computer choice
Win!                           //2nd run display game result
Go to score menu? y/n          //2nd run prompt user for input
Invalid command! Continuing without going to score menu! //2nd run BUG: No user input read
Want to play again? y/n        //2nd run displaying automatic choice

2nd BUG: The application does not handle non numeric inputs

Stage 2 -
Start writing the test and to refactor the code that at the moment is not testable
due to the lack of OO design.

One of the more useful improvement that I can see is to create an interface
for the Player and then implement two sub-classes, Human and Computer so that
the game can then play Human vs Computer, Human vs Human or Computer vs Computer.

************************FINAL COMMENTS********************************

Although this exercise has caused me to work harder and longer than I anticipated,
I have learned a lot in the mean time. This is because the original code was not testable
at all, and I have found this out as I was going to try to use mockito and Junit.
I have appreciated the power of the tests everytime I had to change something in order to
make some portions of the code testable.

At the end of the day it was a good fun and I hope you'll find this MVP good enough for
a follow up interview.

Kind Regards,
Francesco.

