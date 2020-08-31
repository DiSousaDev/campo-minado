package br.dev.diego.cm;

import br.dev.diego.cm.model.Tabuleiro;
import br.dev.diego.cm.view.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
		new TabuleiroConsole(tabuleiro);
		
	}	
}
