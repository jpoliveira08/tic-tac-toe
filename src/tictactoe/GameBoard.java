package tictactoe;

public class GameBoard {
	
	int move1;
	int move2;

	
	
	String gameBoard[][] = {{"1", "2", "3"},
							{"4", "5", "6"},
							{"7", "8", "9"}};
	
	void showingGameBoard() {
		System.out.println("-----GAME BOARD-----");
		for (int i = 0; i < gameBoard.length; i++) {
			for (int j = 0; j < gameBoard.length; j++) {
				System.out.print(" | " + gameBoard[i][j] + " | ");
			}
			System.out.println();
		}
	}
	//Analysis of player 1 move
	public void setMove1(int position, String piece1) {
		this.move1 = position;
		if(move1 > 0 && move1 < 10) {
			
		switch(this.move1) {
		case 1:
			gameBoard[0][0] = piece1;
			break;
		case 2:
			gameBoard[0][1] = piece1;
			break;
		case 3:
			gameBoard[0][2] = piece1;
			break;
		case 4:
			gameBoard[1][0] = piece1;
			break;
		case 5:
			gameBoard[1][1] = piece1;
			break;
		case 6:
			gameBoard[1][2] = piece1;
			break;
		case 7:
			gameBoard[2][0] = piece1;
			break;
		case 8:
			gameBoard[2][1] = piece1;
			break;
		case 9:
			gameBoard[2][2] = piece1;
			break;
			}
		}
	}
	//Analysis of player 2 move
	void setMove2(int position, String piece2) {
		this.move2 = position;
		if(move2 > 0 && move2 < 10) {
		switch(this.move2) {
		case 1:
			gameBoard[0][0] = piece2;
			break;
		case 2:
			gameBoard[0][1] = piece2;
			break;
		case 3:
			gameBoard[0][2] = piece2;
			break;
		case 4:
			gameBoard[1][0] = piece2;
			break;
		case 5:
			gameBoard[1][1] = piece2;
			break;
		case 6:
			gameBoard[1][2] = piece2;
			break;
		case 7:
			gameBoard[2][0] = piece2;
			break;
		case 8:
			gameBoard[2][1] = piece2;
			break;
		case 9:
			gameBoard[2][2] = piece2;
			break;
			}
		}
	}
}
