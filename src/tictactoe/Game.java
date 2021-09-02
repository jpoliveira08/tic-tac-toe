package tictactoe;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Game {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		GameBoard board = new GameBoard();
		Players player = new Players();
		Pieces piece = new Pieces();
		Logic win = new Logic();
//		ValidMove valid = new ValidMove();
		Set<Integer> listMoves = new HashSet<Integer>();
		
		int i = 0;
		String winner = "";
		boolean test = false;
		int move1, move2;
		boolean isValid = true;

		//Testando o tabuleiro
		board.showingGameBoard();
		
		//Definindo o nome dos Jogadores
		System.out.println("Name of Player 1: ");
		player.setPlayer1(entrada.nextLine());
		System.out.println("Name of Player 2: ");
		player.setPlayer2(entrada.nextLine());
		
		while(win.winCheck(board) != true) {
			if(i % 2 == 0) {
				System.out.println(player.getPlayer1() + ", Make your move: ");//Dizendo para o jogador 1 fazer sua jogada
				move1 = entrada.nextInt();
				//Bloco de verificação
				if(listMoves.contains(move1)) {
					isValid = false;
				}
				while(isValid == false) {
					System.out.println("Invalid move, try again");
					move1 = entrada.nextInt();
					if(listMoves.contains(move1)) {
						isValid = false;
					}
					else {
						isValid = true;
					}
				}//Finalização da verificação
				board.setMove1(move1, piece.getPiecePLayer1()); //Definindo a jogada do jogador a partir da posição e peça	
				
				listMoves.add(move1);
				test = win.winCheck(board); //Fazendo a checagem do vencedor
				if(test == true) {
					winner = player.getPlayer1();
					break;
				}
			}//Fim do If
			else{
				System.out.println(player.getPlayer2() + ", Make your move: ");
				move2 = entrada.nextInt();
				if(listMoves.contains(move2)) {
					isValid = false;
				}
				while(isValid == false) {
					System.out.println("Invalid move, try again");
					move2 = entrada.nextInt();
					if(listMoves.contains(move2)) {
						isValid = false;
					}
					else {
						isValid = true;
					}
				}
				board.setMove2(move2, piece.getPiecePLayer2());
				listMoves.add(move2);
				test = win.winCheck(board);
				if(test == true) {
					winner = player.getPlayer2();
					break;
				}
			}//Fim do else
			board.showingGameBoard();
			i++;
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
