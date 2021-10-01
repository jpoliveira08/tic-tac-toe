
<h1 align="center"><strong> TicTacToe Project in Java</strong></h1>



<p align="center">The project was developed to apply Java basics contents that i've been learning during the journey to become a Java developer</p>

## <strong>Contents of the Project</strong>

At this moment, the project contains five classes.
 - Players
 - Pieces
 - GameBoard
 - Logic
 - Game (***with main method***)

 ## <strong>How this code works</strong>
 
 ### Class <strong>Players</strong>
<hr />
<p align="justify">This class is used to set a player name, also to call a name of player to make the respective move.</p>

Example:
<p>At first, asking the name of the players.</p>
<p align="justify">The names will be saved. So we can call them back using the <i>Get</i> method, when it's time to make the respectives moves. As we can see below.</p>
<p align="left">
  <img src="./screenshots/movePlayer1.png" />
</p>
<p align="left">
  <img src="./screenshots/movePlayer2.png" />
</p>

 ### Class <strong>Pieces</strong>
 <hr/>
<p align="justify">At this moment, the respective class has the objetive to set a piece 'x' for the first player and 'o' for second player. The first player will be drawn in main method.</p>


 ### Class <strong>GameBoard</strong>
  <hr/>
<p align="justify">This class is used to show the GameBoard. </p>
<p align="justify">
Initially we have the game board, with all positions that could be chosen. As shown below.
</p>
<p align="left">
  <img src="./screenshots/gameboard_initial.png" />
</p>
<p align="justify">
We get the player move, and using a switch case statement the move is verify and applied to respective position in the matrix.

 ### Class <strong>Logic</strong>
 <hr/>
<p align="justify">
This class is responsible for win check. We take all the eight possibilities of win, and we call the verification method for each new move.
</p>

 ### Class <strong>Game</strong>
 <hr/>
<p align="justify">
The main method contains all instances of the project classes.
</p>

<ul>
<li>
We have a condition to solve who will be the first player using the function Math.random().
</li>
</ul>
<p align="justify">
The class contains a while loop, responsible to run the code until the condition of victory is satisfied. Inside the while loop we have:
</p>
<ul>
<li>
A set that contains the moves already perfomed. 
</li>
<li>
A condition to valid the move
</li>
<li>
A while loop to ask the move until it is valid
</li>
</ul>
<p align="justify">
And the end we have the print of the gameboard with the result, a victory ou a draw.
</p>
 
 
