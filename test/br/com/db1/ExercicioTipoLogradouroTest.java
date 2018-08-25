package br.com.db1;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.db1.type.TipoLogradouro;

public class ExercicioTipoLogradouroTest {
	
	@Test
	public void tipoLogradouroTest() {
	
		assertEquals("AC", TipoLogradouro.ACESSO.getSiglaLogradouro());

	}

}
