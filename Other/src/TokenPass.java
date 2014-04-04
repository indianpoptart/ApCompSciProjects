import java.util.Random;
public class TokenPass {
	private int[] board;
	private int currentPlayer;
	public TokenPass(int playerCount){
		board = new int[playerCount];
		Random rand = new Random();
		for(int i = 0; i < playerCount; i++){
			board[i] = rand.nextInt(10) + 1;
			System.out.println(board[i]);
		}
	}
	public void distributeCurentPlayerTokens(){
		
	}
}
