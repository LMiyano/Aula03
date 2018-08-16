package br.com.db1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

import org.junit.Test;
import br.com.db1.ExercicioInteiros;

public class ExercicioInteirosTest {
	
	
	@Test
	public void ehParTest(){
		ExercicioInteiros exercicioInteiro = new ExercicioInteiros();
		assertTrue(exercicioInteiro.ehPar(2));
		assertFalse(exercicioInteiro.ehPar(3));
		assertTrue(exercicioInteiro.ehPar(10));
	
	}
	
	@Test
	public void ehMaiorTest(){
		ExercicioInteiros exercicioInteiro = new ExercicioInteiros();
		assertTrue(exercicioInteiro.ehMaior(10, 5));
		assertFalse(exercicioInteiro.ehMaior(22, 30));

	}
	
	@Test
	public void somar(){
		ExercicioInteiros exercicioInteiro = new ExercicioInteiros();		
		assertEquals(40, exercicioInteiro.somar(10,30),0);			

	}
	
	@Test
	public void subtrair(){
		ExercicioInteiros exercicioInteiro = new ExercicioInteiros();		
		assertEquals(10, exercicioInteiro.subtrair(40,30),0);			

	}
	
	public void dividir(){
		ExercicioInteiros exercicioInteiro = new ExercicioInteiros();		
		assertEquals(2, exercicioInteiro.dividir(10,5),0);			

	}
	
	public void multiplicar(){
		ExercicioInteiros exercicioInteiro = new ExercicioInteiros();		
		assertEquals(10, exercicioInteiro.multiplicar(2,5),0);			

	}
	
	public void ehImpar(){
		ExercicioInteiros exercicioInteiro = new ExercicioInteiros();
		ArrayList<Integer> impares = new ArrayList<>();
		impares.add(1, 93);
		impares.add(2, 95);
		impares.add(3, 97);
		impares.add(4, 99);
		assertEquals(impares, exercicioInteiro.ehImpar(93));
		}
	}
	

	

