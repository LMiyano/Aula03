package br.com.db1;

import org.junit.Test;

import br.com.db1.type.EstadosBrasileiros;

public class ExercicioEnumTest {
	
	@Test
	public void getAbreviacaoTest() {
		System.out.println(EstadosBrasileiros.getAbreviacao());
	}

	@Test
	public void retornaEstadosTest() {
		System.out.println(EstadosBrasileiros.getEstados());
	}

	@Test
	public void retornaEstadosSulTest() {
		System.out.println(EstadosBrasileiros.getRegiaoSul());
	}

	@Test
	public void retornaEstadosSuDesteTest() {

		System.out.println(EstadosBrasileiros.getRegiaoSudoeste());

	}

	@Test
	public void retornaEstadosNorteTest() {
		System.out.println(EstadosBrasileiros.getRegiaoNorte());

	}

	@Test
	public void retornaEstadosNordesteTest() {
		System.out.println(EstadosBrasileiros.getRegiaoNordeste());

	}

	@Test
	public void retornaEstadosCentroOeste() {
		System.out.println(EstadosBrasileiros.getRegiaoCentroOeste());

	}

}
