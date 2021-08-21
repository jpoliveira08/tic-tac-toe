package tictactoe;

public class Logic{
	//Passando o tabuleiro como parametro para validar as condições de vitória

	boolean winCheck(GameBoard board) {
		if	((board.tabuleiro[0][0] == board.tabuleiro[0][1] && board.tabuleiro[0][0] == board.tabuleiro[0][2]) ||
			 (board.tabuleiro[1][0] == board.tabuleiro[1][1] && board.tabuleiro[1][0] == board.tabuleiro[1][2]) ||
			 (board.tabuleiro[2][0] == board.tabuleiro[2][1] && board.tabuleiro[2][0] == board.tabuleiro[2][2]) ||
			 (board.tabuleiro[0][0] == board.tabuleiro[1][0] && board.tabuleiro[0][0] == board.tabuleiro[2][0]) ||
			 (board.tabuleiro[0][1] == board.tabuleiro[1][1] && board.tabuleiro[0][1] == board.tabuleiro[2][1]) ||
			 (board.tabuleiro[0][2] == board.tabuleiro[1][2] && board.tabuleiro[0][2] == board.tabuleiro[2][2]) ||
			 (board.tabuleiro[0][0] == board.tabuleiro[1][1] && board.tabuleiro[0][0] == board.tabuleiro[2][2]) ||
			 (board.tabuleiro[0][2] == board.tabuleiro[1][1] && board.tabuleiro[0][2] == board.tabuleiro[2][0]))
			return true;
		else {
			return false;
		}
	}//Fim do método
	
}
