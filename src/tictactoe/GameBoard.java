package tictactoe;

public class GameBoard {
	
	int move1;
	int move2;

	
	
	String tabuleiro[][] = {{"1", "2", "3"},
							{"4", "5", "6"},
							{"7", "8", "9"}};
	
	void showingGameBoard() {
		System.out.println("-----GAME BOARD-----");
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro.length; j++) {
				System.out.print(" | " + tabuleiro[i][j] + " | ");
			}
			System.out.println();
		}
	}
	//No momento só estamos analisando o movimento do player 1
	public void setMove1(int position, String piece1) {
		this.move1 = position;
		if(move1 > 0 && move1 < 10) {
			
		switch(this.move1) {
		case 1:
			tabuleiro[0][0] = piece1;
			break;
		case 2:
			tabuleiro[0][1] = piece1;
			break;
		case 3:
			tabuleiro[0][2] = piece1;
			break;
		case 4:
			tabuleiro[1][0] = piece1;
			break;
		case 5:
			tabuleiro[1][1] = piece1;
			break;
		case 6:
			tabuleiro[1][2] = piece1;
			break;
		case 7:
			tabuleiro[2][0] = piece1;
			break;
		case 8:
			tabuleiro[2][1] = piece1;
			break;
		case 9:
			tabuleiro[2][2] = piece1;
			break;
			}
		}
	}
	void setMove2(int position, String piece2) {
		this.move2 = position;
		if(move2 > 0 && move2 < 10) {
		switch(this.move2) {
		case 1:
			tabuleiro[0][0] = piece2;
			break;
		case 2:
			tabuleiro[0][1] = piece2;
			break;
		case 3:
			tabuleiro[0][2] = piece2;
			break;
		case 4:
			tabuleiro[1][0] = piece2;
			break;
		case 5:
			tabuleiro[1][1] = piece2;
			break;
		case 6:
			tabuleiro[1][2] = piece2;
			break;
		case 7:
			tabuleiro[2][0] = piece2;
			break;
		case 8:
			tabuleiro[2][1] = piece2;
			break;
		case 9:
			tabuleiro[2][2] = piece2;
			break;
			}
		}
	}
}
