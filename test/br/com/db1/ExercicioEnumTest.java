package br.com.db1;

import org.junit.Test;

public class ExercicioEnumTest {

	@Test
	public void retornaEstadosTest() {	
		for (EstadosBrasileiros estados : EstadosBrasileiros.values()) {
			System.out.println(estados.getNome().toString());
		}
	}

	@Test
	public void retornaEstadosSulTest() {
		for (EstadosBrasileiros estados : EstadosBrasileiros.values()) {
			if (estados.getRegiao().toString() == "SUL") {

				// System.out.println(estados.getNome().toString());
			}

		}

	}

	@Test
	public void retornaEstadosSuDesteTest() {
		for (EstadosBrasileiros estados : EstadosBrasileiros.values()) {
			if (estados.getRegiao().toString() == "SUDESTE") {

				// System.out.println(estados.getNome().toString());
			}

		}

	}

	@Test
	public void retornaEstadosNorteTest() {
		for (EstadosBrasileiros estados : EstadosBrasileiros.values()) {
			if (estados.getRegiao().toString() == "NORTE") {

				// System.out.println(estados.getNome().toString());
			}

		}

	}

	@Test
	public void retornaEstadosNordesteTest() {
		for (EstadosBrasileiros estados : EstadosBrasileiros.values()) {
			if (estados.getRegiao().toString() == "NORDESTE") {

				// System.out.println(estados.getNome().toString());
			}

		}

	}

	@Test
	public void retornaEstadosCentroOeste() {
		for (EstadosBrasileiros estados : EstadosBrasileiros.values()) {
			if (estados.getRegiao().toString() == "CENTRO-OESTE") {

				// System.out.println(estados.getNome().toString());
			}

		}

	}

}
