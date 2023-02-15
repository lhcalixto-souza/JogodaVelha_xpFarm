
A tic-tac-toe game developed in Java

Java: 17.0.5

The executable .jar file is already inserted in the project.
Give it a pull and check it out.

A short summary of the code:

- To facilitate the testing of the game, initially the code was made for one player against the computer,after being tested, the class of the second robot was implemented following the same metric as the first.

- Bot1 and Computer 1 are classes that assign random methods of generating value and implementing values ​​in each quadrant of the board.

- The board class displays the board according to the moves, allowing to follow each movement of the players (the bots) and generating the final board after the victory of one of the two players.

- In the Board Possition class, a method was created so that each player could select a quadrant and mark its symbol, bearing in mind that the symbols alternate with each move.
And another method was implemented to check the winner, adding in a list of arrays all the possibilities of victory and considering a tie when none of them is achieved by any player.

- Finally, in the main class, we have the game generation method, checking at each move if there is a winner, if so the game is finished.
