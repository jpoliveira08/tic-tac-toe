package tictactoe;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Game {
	
	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);
		GameBoard board = new GameBoard();
		Players player = new Players();
		Pieces piece = new Pieces();
		Logic win = new Logic();
		
		Set<Integer> listMoves = new HashSet<Integer>();
		
		int i = 0;
		String winner = "";
		boolean test = false;
		int move1, move2;
		boolean isValid = true;
		String name1, name2;
		
		//Showing the gameBoard
		board.showingGameBoard();
		
		//Name of Players
		System.out.println("Enter player names: ");
		name1 = entry.nextLine();
		name2 = entry.nextLine();
		
		//Sort the first player
		if(Math.random() > 0.5) {
			player.setPlayer1(name1);
			player.setPlayer2(name2);
		}
		else {
			player.setPlayer1(name2);
			player.setPlayer2(name1);	
		}
		
		
		System.out.println("\n" + player.getPlayer1() + ", will play with: " + piece.getPiecePLayer1() + "\n" + player.getPlayer2() + ", will play with: " + piece.getPiecePLayer2() + "\n");
		while(win.winCheck(board) != true) {
			if(i % 2 == 0) {
				System.out.println(player.getPlayer1() + ", Make your move: ");
				move1 = entry.nextInt();
				//Verify the valid move
				if(listMoves.contains(move1)) {
					isValid = false;
				}
				while(isValid == false) {
					System.out.println("Invalid move, try again");
					move1 = entry.nextInt();
					if(listMoves.contains(move1)) {
						isValid = false;
					}
					else {
						isValid = true;
					}
				}//End of verification
				board.setMove1(move1, piece.getPiecePLayer1()); //Define the move from position and piece
					
				
				listMoves.add(move1);
				test = win.winCheck(board); //Win check
				if(test == true) {
					winner = player.getPlayer1();
					break;
				}
			}//End of IF
			else{
				System.out.println(player.getPlayer2() + ", Make your move: ");
				move2 = entry.nextInt();
				if(listMoves.contains(move2)) {
					isValid = false;
				}
				while(isValid == false) {
					System.out.println("Invalid move, try again");
					move2 = entry.nextInt();
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
			}//End of ELSE
			board.showingGameBoard();
			i++;
		}//End of FOR
		System.out.println("\n--FINAL GAME BOARD--\n");
		board.showingGameBoard();
		
		if(winner.isEmpty()) {
			System.out.println("\nA DRAW !!!\n");
		}
		else {
			System.out.println(winner + " WELL DONE!\nYOU WON !!!");			
		}
		entry.close();
	}

}
