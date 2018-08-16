package br.com.db1;

public class ExercicioTexto {
	
	public String maiusculas(String texto) 
	{
		return texto.toUpperCase();
		
	}
	
	public String minisculas(String texto) 
	{
		return texto.toLowerCase();
		
		
	}
	
	public Integer numeroDeLetras(String texto) 
	{
		return texto.length();
		
	}
	
	public Integer numeroDeLetrasComEspaco(String texto) 
	{
		return texto.length();
		
	}
	
	public Integer numeroDeLetrasSemEspaco(String texto) 
	{
		return texto.trim().length();	
	}
	
	public String nomeDepois3Letra(String texto) 
	{
		return texto.substring(3);
	}
	
	public String nome4UltimasLetras(String texto) 
	{
		return texto.substring(texto.length()-4);
	}
	
	
	
	
	
	

}
