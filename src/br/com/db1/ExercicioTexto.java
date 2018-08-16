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
	
	public String substituir1Palavra(String texto)
	{	
		String primeiraPalavra = texto.replaceFirst(texto.substring(texto.indexOf(" ")), "");
		return texto.replace(primeiraPalavra, "Aluno/Aluna");
	}
	
	public String dividirPalavra(String texto)
	{	
		return texto.replace(",", " ");
	}
	
	public Integer exibeVogais(String texto)
	{	
		int vogais = 0;		
		for (int i = 0; i < texto.length(); i++) {
			char letra = texto.toLowerCase().charAt(i);
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
				vogais++;
		}	
		return vogais++;		
	}
	
	public String inverterTexto(String texto)
	{
		String inverter = new StringBuilder(texto).reverse().toString();
		
		return inverter;
	}
	
	
	

}
