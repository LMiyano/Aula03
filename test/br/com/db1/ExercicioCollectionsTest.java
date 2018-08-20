package br.com.db1;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;


import static org.junit.Assert.*;


public class ExercicioCollectionsTest {
	
	@Test
	public void listaDeCoresTest()
	{		
		ExercicioCollections exercicioCollections = new ExercicioCollections();
		ArrayList<String> cores = new ArrayList<String>();
		cores.add("preto");
		cores.add("azul");
		cores.add("vermelho");		
		cores.add("verde");
		cores.add("amarelo");		
		cores.add("roxo");	
		assertEquals(6, exercicioCollections.listaDeCores(cores).size());	
	}
	
	@Test
	public void quantidadeListaTest()
	{		
		ExercicioCollections exercicioCollections = new ExercicioCollections();
		ArrayList<String> cores = new ArrayList<String>();
		cores.add("preto");
		cores.add("azul");
		cores.add("vermelho");		
		cores.add("verde");
		assertEquals(4, exercicioCollections.quantidadeLista(cores),0);	
	}
	
	@Test
	public void apagarElementosTest()
	{		
		ExercicioCollections exercicioCollections = new ExercicioCollections();
		ArrayList<String> pessoas = new ArrayList<String>();
		pessoas.add("preto");
		pessoas.add("azul");
		pessoas.add("vermelho");		
		pessoas.add("verde");
		pessoas.add("amarelo");		
		pessoas.add("roxo");
		ArrayList<String> apagar = new ArrayList<String>();
		apagar.add("preto");
		apagar.add("vermelho");	
		apagar.add("rosa");	
		
		assertFalse (exercicioCollections.apagarElementos(pessoas, apagar).equals(Arrays.asList("verde", "azul")));		
		assertTrue (exercicioCollections.apagarElementos(pessoas, apagar).equals((Arrays.asList("azul", "verde","amarelo","roxo"))));
	}
	
	@Test
	public void apagarSegundoElementoTest()
	{		
		ExercicioCollections exercicioCollections = new ExercicioCollections();	
		ArrayList<String> cidades = new ArrayList<String>();
		cidades.add("Londrina");
		cidades.add("Maringá");	
		cidades.add("Curitiba");
		assertFalse (exercicioCollections.apagarSegundoElemento(cidades).equals(Arrays.asList("Maringá")));
		assertFalse (exercicioCollections.apagarSegundoElemento(cidades).equals(Arrays.asList("Londrina", "Curitiba")));
	}
	
	@Test
	public void coresOrdenadasTest()
	{		
		ExercicioCollections exercicioCollections = new ExercicioCollections();
		ArrayList<String> cores = new ArrayList<String>();
		cores.add("preto");
		cores.add("azul");
		cores.add("vermelho");		
		cores.add("verde");	
		cores.add("amarelo");	
		assertEquals(Arrays.asList("amarelo", "azul", "preto", "verde", "vermelho"), exercicioCollections.coresOrdenadas(cores));	
	}
	
	@Test
	public void apagarCorTest()
	{		
		ExercicioCollections exercicioCollections = new ExercicioCollections();	
		ArrayList<String> cores = new ArrayList<String>();		
		cores.add("azul");
		cores.add("vermelho");		
		cores.add("verde");	
		cores.add("amarelo");		
		assertEquals(Arrays.asList("amarelo", "azul", "verde", "vermelho"), exercicioCollections.coresOrdenadas(cores));
	}
	

}
