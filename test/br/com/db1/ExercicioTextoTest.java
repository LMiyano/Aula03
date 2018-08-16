package br.com.db1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExercicioTextoTest {
	
	@Test
	public void maiusculasTest() 
	{
		ExercicioTexto exerciciotexto = new ExercicioTexto();
		assertEquals("DB1START",exerciciotexto.maiusculas("db1start"));
		
	}
	
	@Test
	public void minisculasTest() 
	{
		ExercicioTexto exerciciotexto = new ExercicioTexto();
		assertEquals("db1start",exerciciotexto.minisculas("DB1START"));
		
	}
	
	@Test
	public void numeroDeLetrasTest() 
	{
		ExercicioTexto exerciciotexto = new ExercicioTexto();
		assertEquals(8,exerciciotexto.numeroDeLetras("DB1START"),0);
		
	}
	
	@Test
	public void numeroDeLetrasComEspacoTest() 
	{
		ExercicioTexto exerciciotexto = new ExercicioTexto();
		assertEquals(10,exerciciotexto.numeroDeLetrasComEspaco(" DB1START "),0);
		
	}
	
	@Test
	public void numeroDeLetrasSemEspacoTest() 
	{
		ExercicioTexto exerciciotexto = new ExercicioTexto();
		assertEquals(10,exerciciotexto.numeroDeLetrasComEspaco(" DB1START "),0);		
	}
	
	@Test
	public void nomeDepois3LetraTest() 
	{
		ExercicioTexto exerciciotexto = new ExercicioTexto();
		assertEquals("nardo Takashi Miyano",exerciciotexto.nomeDepois3Letra("Leonardo Takashi Miyano"));	
	}
	
	@Test
	public void nome4UltimasLetrasTest() 
	{
		ExercicioTexto exerciciotexto = new ExercicioTexto();
		assertEquals("yano",exerciciotexto.nome4UltimasLetras("Leonardo Takashi Miyano"));
	}

}
