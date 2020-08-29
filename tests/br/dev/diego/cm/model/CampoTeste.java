package br.dev.diego.cm.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CampoTeste {

	private Campo campo;
	
	@BeforeEach
	void iniciarCampo() {
		 campo = new Campo(3,3);
	}
	
	@Test
	void testVizinhoRealDistancia1Esquerda() {
		Campo vizinho = new Campo(3, 2);
		assertTrue(campo.adicionarVizinho(vizinho));
	}
	
	@Test
	void testVizinhoRealDistancia1Direita() {
		Campo vizinho = new Campo(3,4);
		assertTrue(campo.adicionarVizinho(vizinho));
	}
	
	@Test
	void testVizinhoRealDistancia1Baixo() {
		Campo vizinho = new Campo(4,3);
		assertTrue(campo.adicionarVizinho(vizinho));
	}

	@Test
	void testVizinhoRealDistancia1Cima() {
		Campo vizinho = new Campo(2,3);
		assertTrue(campo.adicionarVizinho(vizinho));
	}
	
	@Test
	void testVizinhoDiagnonal1() {
		Campo vizinho = new Campo(2,2);
		assertTrue(campo.adicionarVizinho(vizinho));
	}
	
	@Test
	void testVizinhoDiagnonal2() {
		Campo vizinho = new Campo(2,4);
		assertTrue(campo.adicionarVizinho(vizinho));
	}
	
	@Test
	void testVizinhoDiagnonal3() {
		Campo vizinho = new Campo(4,2);
		assertTrue(campo.adicionarVizinho(vizinho));
	}
	
	@Test
	void testVizinhoDiagnonal4() {
		Campo vizinho = new Campo(4,4);
		assertTrue(campo.adicionarVizinho(vizinho));
	}
		
	@Test
	void testNaoVizinho() {
		Campo vizinho = new Campo(1,1);
		assertFalse(campo.adicionarVizinho(vizinho));
	}
}
