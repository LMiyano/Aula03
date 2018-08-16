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
	
	@Test
	public void substituir1PalavraTest()
	{
		ExercicioTexto exerciciotexto = new ExercicioTexto();
		assertEquals("Aluno/Aluna Takashi Miyano",exerciciotexto.substituir1Palavra("Leonardo Takashi Miyano"));
	}
	
	@Test
	public void dividirPalavraTest()
	{
		ExercicioTexto exerciciotexto = new ExercicioTexto();
		assertEquals("banana maçã melancia",exerciciotexto.dividirPalavra("banana,maçã,melancia"));
	}
	
	@Test
	public void exibeVogaisTest()
	{
		ExercicioTexto exerciciotexto = new ExercicioTexto();
		assertEquals(9,exerciciotexto.exibeVogais("banana,maça,melancia"),0);
	}
	
	@Test
	public void inverterTextoTest()
	{
		ExercicioTexto exerciciotexto = new ExercicioTexto();
		assertEquals("odranoel",exerciciotexto.inverterTexto("leonardo"));
	}
}
