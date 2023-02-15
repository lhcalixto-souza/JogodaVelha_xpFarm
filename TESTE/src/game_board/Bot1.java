package game_board;

import java.util.Random;

public class Bot1 {
	Random aleatorio = new Random();
	private String nome = "BOT1";
	public int botJogada() {
		int botPos = aleatorio.nextInt(9) +1;
		return botPos;
	}

}
