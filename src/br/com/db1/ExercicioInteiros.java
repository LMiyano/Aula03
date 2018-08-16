package br.com.db1;


import java.awt.List;

public class ExercicioInteiros {
	
	public Boolean ehPar(Integer parametro) {
		return parametro % 2 == 0;		
	}
	
	public Boolean ehMaior(Integer valor1, Integer valor2){
		return valor1 > valor2;
	}
	
	public Integer somar(Integer valor1, Integer valor2){
		return valor1 + valor2;
	
	}
	
	public Integer subtrair(Integer valor1, Integer valor2){
		return valor1 - valor2;
	
	}
	
	public Integer dividir(Integer valor1, Integer valor2){
		return valor1 / valor2;
	}
	
	public Integer multiplicar(Integer valor1, Integer valor2){
		return valor1 * valor2;
	
	}
	
	public List ehImpar(Integer parametro){
		List impares = new List();		
		for( Integer i=parametro;  i<=100; i++){			
			
			if (i % 2 !=0 ) {
				impares.add(i.toString());		
			}
		}
		return impares;			
	
	}
	

}
