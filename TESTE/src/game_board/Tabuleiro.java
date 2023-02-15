package game_board;

public class Tabuleiro {
	private  char [][] tabuleiro =  new char [3][3];
	
	
	public char [][] getTabuleiro() {
		return tabuleiro;
	}
	public void setTabuleiro(char [][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}
	public void limpaTabuleiro() {
		for(int linha =0;linha<tabuleiro.length;linha++) {
			for(int coluna = 0;coluna<1;coluna++) {
				this.tabuleiro[linha][coluna] = ' ';
			}
		}
	}
	
	public void atribuiIcone(char icone, int linha,int coluna ) {
		this.tabuleiro[linha][coluna] = icone;
		exibeTabuleiro();
	}
	
	public void exibeTabuleiro() {
		char [][] showTable = getTabuleiro();
		System.out.println();
		for(int linha = 0;linha<tabuleiro.length;linha++) {
				System.out.print(" "+showTable[linha][0] + " | " + showTable[linha][1] + " |" + showTable[linha][2]);
				if(linha<2) {
					System.out.println(); 
					System.out.println("---*---*---");
				}
		}
	}
}
