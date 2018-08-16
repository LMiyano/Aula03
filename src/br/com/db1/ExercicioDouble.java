package br.com.db1;

public class ExercicioDouble {
	
	
	public Boolean ehMenor(Double valor1, Double valor2){
		return valor1 < valor2;
	}
	
	public Double ehMenor3(Double valor1, Double valor2 , Double valor3){	
		return Math.min(valor1, Math.min(valor2,valor3));	
	}
	
	public Double media(Double valor1, Double valor2 , Double valor3){	
		return (valor1 + valor2 + valor3)/3;
		}
	
	public Double areaTriangulo(Double base, Double altura){	
		return (base * altura)/2;
		}
	
}
