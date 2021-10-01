package tictactoe;

public class Logic{
	

	boolean winCheck(GameBoard board) {
		if	((board.gameBoard[0][0] == board.gameBoard[0][1] && board.gameBoard[0][0] == board.gameBoard[0][2]) ||
			 (board.gameBoard[1][0] == board.gameBoard[1][1] && board.gameBoard[1][0] == board.gameBoard[1][2]) ||
			 (board.gameBoard[2][0] == board.gameBoard[2][1] && board.gameBoard[2][0] == board.gameBoard[2][2]) ||
			 (board.gameBoard[0][0] == board.gameBoard[1][0] && board.gameBoard[0][0] == board.gameBoard[2][0]) ||
			 (board.gameBoard[0][1] == board.gameBoard[1][1] && board.gameBoard[0][1] == board.gameBoard[2][1]) ||
			 (board.gameBoard[0][2] == board.gameBoard[1][2] && board.gameBoard[0][2] == board.gameBoard[2][2]) ||
			 (board.gameBoard[0][0] == board.gameBoard[1][1] && board.gameBoard[0][0] == board.gameBoard[2][2]) ||
			 (board.gameBoard[0][2] == board.gameBoard[1][1] && board.gameBoard[0][2] == board.gameBoard[2][0]))
			return true;
		else {
			return false;
		}
	}//Fim do método
	
}
