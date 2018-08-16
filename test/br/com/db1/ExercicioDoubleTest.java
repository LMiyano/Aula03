package br.com.db1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.db1.ExercicioDouble;

public class ExercicioDoubleTest {	

	
	@Test
	public void ehMenorTest(){
		ExercicioDouble exercicioDouble = new ExercicioDouble();
		assertTrue(exercicioDouble.ehMenor(5.0, 5.7));
		assertFalse(exercicioDouble.ehMenor(10.5, 5.3));
	}
	
	@Test
	public void ehMenor3Test(){
		ExercicioDouble exercicioDouble = new ExercicioDouble();		
		assertEquals(5.0, exercicioDouble.ehMenor3(5.0, 5.7,5.3),0);
	}
	
	@Test
	public void mediaTest(){
		ExercicioDouble exercicioDouble = new ExercicioDouble();		
		assertEquals(6.0, exercicioDouble.media(5.0, 6.0, 7.0),0);
	}
	
	@Test
	public void areaTrianguloTest(){
		ExercicioDouble exercicioDouble = new ExercicioDouble();		
		assertEquals(15.0, exercicioDouble.areaTriangulo(5.0, 6.0),0);
	}

}
