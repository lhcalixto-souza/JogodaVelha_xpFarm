package game_main;

import java.util.Scanner;

import game_board.Bot1;
import game_board.Computador;
import game_board.Tabuleiro;


public class TicTacToe_main {

	public static void main(String[] args) {
		String player = "Jogador1" ;
		String resultado = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Bem vindo(a) ao jogo da velha");
		Tabuleiro board = new Tabuleiro();
		BoardPosition posicaoJogador = new BoardPosition();
		Bot1 botJogador = new Bot1();
		Computador cpu = new Computador();
		board.limpaTabuleiro();
		// Começo do jogo.
		while(true) {
			System.out.println();
			//System.out.println("Digite a posição do jogo (1-9):");
			//int posJogador1 = scan.nextInt();
			int posJogador1 = botJogador.botJogada();
			while (posicaoJogador.posicaoJogador1.contains(posJogador1) || posicaoJogador.posicaoCPU.contains(posJogador1) ) {
				//System.out.println("Posição Ocupada, digite outro valor: ");
				//posJogador1 = scan.nextInt();
				posJogador1 = botJogador.botJogada();
			}
			
			posicaoJogador.marcaPosicao(posJogador1,player = "Jogador1");
			resultado = posicaoJogador.checaVencendor();
			if(resultado.length()>0) {
				System.out.println(resultado);
				break;
			}
			int posCPU = cpu.cpuJogada();
			while (posicaoJogador.posicaoJogador1.contains(posCPU) || posicaoJogador.posicaoCPU.contains(posCPU) ) {
				posCPU = cpu.cpuJogada();
			}
			posicaoJogador.marcaPosicao(posCPU,player = "CPU");
			resultado = posicaoJogador.checaVencendor();
			if(resultado.length()>0) {
				System.out.println(resultado);
				break;
			}

		}
		
	}
}

	
