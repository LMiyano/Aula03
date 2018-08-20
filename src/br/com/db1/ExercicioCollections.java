package br.com.db1;

import java.text.Collator;
import java.util.Collections;
import java.util.List;

public class ExercicioCollections {

	public List<String> listaDeCores(List<String> cores) {
		return cores;
	}

	public Integer quantidadeLista(List<String> cores) {
		return cores.size();
	}

	public List<String> apagarElementos(List<String> pessoas,List<String> apagar) {
		pessoas.removeAll(apagar);
		return pessoas;

	}

	public List<String> apagarSegundoElemento(List<String> cidades) {
		cidades.remove(1);
		return cidades;

	}

	public List<String> coresOrdenadas(List<String> cores) {
		Collections.sort(cores, Collator.getInstance());		
		return cores;
	}
	
	public List<String> apagarCor(List<String> cores) {
		
		return cores;

	}

}
