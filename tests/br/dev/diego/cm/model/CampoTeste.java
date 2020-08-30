package br.dev.diego.cm.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.dev.diego.cm.exception.ExplosaoException;

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
	
	
	@Test
	void testAlternarMarcacao() {
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());	
	}
	
		
	@Test
	void testeAbrirNaoMinadoMarcado() {
		campo.alternarMarcacao();
		campo.minar();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbrirMinadoNaoMarcado() {
		campo.minar();
		
		assertThrows(ExplosaoException.class, () -> {
			campo.abrir();
		});
	}
	
	@Test
	void testeAbrirComVizinhos() {
				
		Campo v1 = new Campo(1, 1);
		Campo v2 = new Campo(2, 2);
		
		v2.adicionarVizinho(v1);
		
		campo.adicionarVizinho(v2);		
		
		campo.abrir();
		
		assertTrue(v1.isAberto() && v2.isAberto());
		
	}
	
	@Test
	void testeAbrirComVizinhos2() {
				
		Campo v1 = new Campo(1, 1);
		Campo v11 = new Campo(1, 1);
		v11.minar();
		
		Campo v2 = new Campo(2, 2);
		v2.adicionarVizinho(v1);
		v2.adicionarVizinho(v11);
		
		campo.adicionarVizinho(v2);		
		campo.abrir();
		
		assertTrue(v2.isAberto() && v1.isFechado());
		
	}
	
	@Test
	void testGetLinhaColuna() {
		Campo v1 = new Campo(1, 1);
		v1.getLinha();
	}
	
	@Test
	void testObjetivoAlcancado() {
		Campo v1 = new Campo(1, 1);
		
	}
}
