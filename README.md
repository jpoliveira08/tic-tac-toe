<h4 align="center"> 
	🚧  TicTacToe  under construction...  🚧
</h4>

# <center><strong>TicTacToe Project in Java</strong></center>


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
<p align="justify">This class was create to apply the methods Gatters and Setters. In this project is used to set a player name, also to call a name of player to make the respective move.</p>

Example:
<p>At first, asking the name of the players.</p>
<p align="left">
  <img src="./screenshots/namePlayer1.png" />
</p>
<p align="left">
  <img src="./screenshots/namePlayer2.png" />
</p>
<p align="justify">The users will put their respectives names, and will be saved in <i>Set</i> method. So we can call them back using the <i>Get</i> method, when it's time to make the respectives moves. As we can see below.</p>
<p align="left">
  <img src="./screenshots/movePlayer1.png" />
</p>
<p align="left">
  <img src="./screenshots/movePlayer2.png" />
</p>

 ### Class <strong>Pieces</strong>
 <hr/>
<p align="justify">At this moment, the respective class has the objetive to set a piece for each player. Initially, the first player will play with "x" and the second player will play with "o".</p>
<p align="justify">In this class, we have two methods <i>Getters</i>, thats returns the piece of respective player.</p>
<h4 align="center"> 
	🚧  In future this class will randomly choose the piece for Players  🚧
</h4>

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
We get the player move, and using a switch case statement the move is verify and applied to respective position in the matrix. As shown the code.
</p>
<p align="justify">
A good example is, the first player enter the number <strong>1</strong>, and your piece is assigned in position <strong>[0][0]</strong> from matrix.
<br>
The same logic works for futures moves in diferrent positions. As long as, it is a valid move.
</p>

~~~Java
switch(move){
		case 1:
			tabuleiro[0][0] = piece1;
			break;
}
~~~~

 
 
