package game_board;

import java.util.Random;

public class Computador extends Tabuleiro {
	Random aleatorio = new Random();
	private String nome = "CPU";
	public int cpuJogada() {
		int cpuPos = aleatorio.nextInt(9) +1;
		return cpuPos;
	}
}
