package tictactoe;
import java.util.Scanner;

public class Game {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		GameBoard board = new GameBoard();
		Players player = new Players();
		Pieces piece = new Pieces();
		Logic win = new Logic();
		
		
		String winner = "";
		boolean test = false;
		//Testando o tabuleiro
		board.showingGameBoard();
		
		//Definindo o nome dos Jogadores
		System.out.println("Name of Player 1: ");
		player.setPlayer1(entrada.nextLine());
		System.out.println("Name of Player 2: ");
		player.setPlayer2(entrada.nextLine());
		
		for(int i = 0; i < 9; i++) {
			if(i % 2 == 0) {
				System.out.println(player.getPlayer1() + ", Make your move: ");
				board.setMove1(entrada.nextInt(), piece.getPiecePLayer1());
				test = win.winCheck(board); //Fazendo a checagem do vencedor
				if(test == true) {
					winner = player.getPlayer1();
					break;
				}
			}//Fim do If
			else{
				System.out.println(player.getPlayer2() + ", Make your move: ");
				board.setMove2(entrada.nextInt(), piece.getPiecePLayer2());
				test = win.winCheck(board);
				if(test == true) {
					winner = player.getPlayer2();
					break;
				}
			}//Fim do else
			board.showingGameBoard();			
		}//final do for
		System.out.println("\n--FINAL GAME BOARD--\n");
		board.showingGameBoard();
		
		if(winner.isEmpty()) {
			System.out.println("\nA DRAW !!!\n");
		}
		else {
			System.out.println(winner + " WELL DONE!\nYOU WON !!!");			
		}
		entrada.close();
	}
}
