package br.com.db1;

import org.junit.Test;

import java.util.ArrayList;
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
		assertEquals(4, exercicioCollections.listaDeCores(cores).size());	
	}




}
