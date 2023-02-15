package game_main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import game_board.Tabuleiro;

public class BoardPosition extends Tabuleiro {
	
	private char icone = 'X';
	
	static ArrayList<Integer> posicaoJogador1 = new ArrayList<Integer>();
	static ArrayList<Integer> posicaoCPU = new ArrayList<Integer>();


	Tabuleiro board  = new Tabuleiro();
	
	public void marcaPosicao(int pos,String player) {
		if(pos<1 || pos>9) {
			System.out.println("Posição Invalida");
		}
		if(player.equals("Jogador1")) {
			icone = 'X';
			posicaoJogador1.add(pos);
			System.out.println("Jogador Bot1");
		}
		else if(player.equals("CPU")){
			icone = 'O';
			posicaoCPU.add(pos);
			System.out.println("Jogador Computador");
		}
		
		switch (pos) {
		case 1:
			System.out.println("JOGADA REALIZADA: ");
			board.atribuiIcone(icone, 0, 0);
		break;
		case 2:
			System.out.println("JOGADA REALIZADA: ");
			board.atribuiIcone(icone, 0, 1);
			break;
		case 3:
			System.out.println("JOGADA REALIZADA: ");
			board.atribuiIcone(icone, 0, 2);
			break;
		case 4:
			System.out.println("JOGADA REALIZADA: ");
			board.atribuiIcone(icone, 1, 0);
			break;
		case 5:
			System.out.println("JOGADA REALIZADA: ");
			board.atribuiIcone(icone, 1, 1);
			break;
		case 6:
			System.out.println("JOGADA REALIZADA: ");
			board.atribuiIcone(icone, 1, 2);
			break;
		case 7:
			System.out.println("JOGADA REALIZADA: ");
			board.atribuiIcone(icone, 2, 0);
			break;
		case 8:
			System.out.println("JOGADA REALIZADA: ");
			board.atribuiIcone(icone, 2, 1);
			break;
		case 9:
			System.out.println("JOGADA REALIZADA: ");
			board.atribuiIcone(icone, 2, 2);
			break;
		}
		System.out.println();
	}
	
	public static String checaVencendor() {
		List linha1 = Arrays.asList(1,2,3);
		List linha2 = Arrays.asList(4,5,6);
		List linha3 = Arrays.asList(7,8,9);
		List coluna1 = Arrays.asList(1,4,7);
		List coluna2 = Arrays.asList(2,5,8);
		List coluna3 = Arrays.asList(3,6,9);
		List diagonal1 = Arrays.asList(1,5,9);
		List diagonal2 = Arrays.asList(3,5,7);


		List<List> posicaoGanhador = new ArrayList<List>();
		posicaoGanhador.add(linha1);
		posicaoGanhador.add(linha2);
		posicaoGanhador.add(linha3);
		posicaoGanhador.add(coluna1);
		posicaoGanhador.add(coluna2);
		posicaoGanhador.add(coluna3);
		posicaoGanhador.add(diagonal1);
		posicaoGanhador.add(diagonal2);
		
		for(List l : posicaoGanhador) {
			if(posicaoJogador1.containsAll(l)) {
				return "Parabéns bot1 você ganhou!!";
			}
			else if(posicaoCPU.containsAll(l)){
				return  "Parabéns Computador você ganhou!";
			}
			else if(posicaoJogador1.size() + posicaoCPU.size() == 9) {
				if(!posicaoCPU.containsAll(l)){
					if(!posicaoJogador1.containsAll(l)) {
						return "Empate, não foi dessa vez.";
					}
					else {
						return "Parabéns você ganhou";
					}
				}
				else {
					return  "O Computador Venceu, tente novamente";
				}

			}
		}
		return "";
	}
}