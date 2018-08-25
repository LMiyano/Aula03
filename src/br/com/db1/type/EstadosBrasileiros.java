package br.com.db1.type;

import java.util.ArrayList;

public enum EstadosBrasileiros {

	ACRE("Acre", "AC", "NORTE"), ALAGOAS("Alagoas", "AL", "NORDESTE"), AMAPA(
			"Amap�", "AP", "NORTE"), AMAZONAS("Amazonas", "AM", "NORTE"), BAHIA(
			"Bahia", "BA", "NORDESTE"), CEARA("Cear�", "CE", "NORDESTE"), DISTRITOFEDERAL(
			"Distrito Federal", "DF", "CENTRO-OESTE"), ESPIRITOSANTO(
			"Esp�rito Santo", "ES", "SUDESTE"), GOIAS("Goi�s", "GO",
			"CENTRO-OESTE"), MARANHAO("Maranh�o", "MA", "NORDESTE"), MATOGROSSO(
			"Mato Grosso", "MT", "CENTRO-OESTE"), MATOGROSSODOSUL(
			"Mato Grosso do Sul", "MS", "CENTRO-OESTE"), MINASGERAIS(
			"Minas Gerais", "MG", "SUDESTE"), PARA("Par�", "PA", "NORTE"), PARAIBA(
			"Para�ba", "PB", "NORDESTE"), PARANA("Paran�", "PR", "SUL"), PERNAMBUCO(
			"Pernambuco", "PE", "NORDESTE"), PIAUI("Piau�", "PI", "NORDESTE"), RIODEJANEIRO(
			"Rio de Janeiro", "RJ", "SUDESTE"), RIOGRANDEDONORTE(
			"Rio Grande do Norte", "RN", "NORDESTE"), RIOGRANDEDOSUL(
			"Rio Grande do Sul", "RS", "SUL"), RONDONIA("Rond�nia", "RO",
			"NORTE"), RORAIMA("Roraima", "RR", "NORTE"), SANTACATARINA(
			"Santa Catarina", "SC", "SUL"), SAOPAULO("S�o Paulo", "SP",
			"SUDESTE"), SERGIPE("Sergipe", "SE", "NORDESTE"), TOCANTINS(
			"Tocantins", "TO", "NORTE");

	private String nome;
	private String sigla;
	private String regiao;

	private EstadosBrasileiros(String nome, String sigla, String regiao) {
		this.nome = nome;
		this.sigla = sigla;
		this.regiao = regiao;
	}

	public String getNome() {
		return nome;
	}

	public String getSigla() {
		return sigla;
	}

	public String getRegiao() {
		return regiao;
	}

	public static String getAbreviacao() {
		ArrayList<String> lista = new ArrayList<String>();
		for (EstadosBrasileiros estados : EstadosBrasileiros.values()) {
			lista.add(estados.getSigla().toString());
		}
		return lista.toString();

	}

	public static String getEstados() {
		ArrayList<String> lista = new ArrayList<String>();
		for (EstadosBrasileiros estados : EstadosBrasileiros.values()) {
			lista.add(estados.getNome().toString());
		}
		return lista.toString();

	}

	public static String getRegiaoSul() {
		ArrayList<String> lista = new ArrayList<String>();
		for (EstadosBrasileiros estados : EstadosBrasileiros.values()) {
			if (estados.regiao.toString() == "SUL") {
				lista.add(estados.getNome().toString());
			}
		}
		return lista.toString();

	}

	public static String getRegiaoSudoeste() {
		ArrayList<String> lista = new ArrayList<String>();
		for (EstadosBrasileiros estados : EstadosBrasileiros.values()) {
			if (estados.regiao.toString() == "SUDESTE") {
				lista.add(estados.getNome().toString());
			}
		}
		return lista.toString();
	}

	public static String getRegiaoNorte() {
		ArrayList<String> lista = new ArrayList<String>();
		for (EstadosBrasileiros estados : EstadosBrasileiros.values()) {
			if (estados.regiao.toString() == "NORTE") {
				lista.add(estados.getNome().toString());
			}
		}
		return lista.toString();

	}

	public static String getRegiaoNordeste() {
		ArrayList<String> lista = new ArrayList<String>();
		for (EstadosBrasileiros estados : EstadosBrasileiros.values()) {
			if (estados.regiao.toString() == "NORDESTE") {
				lista.add(estados.getNome().toString());
			}
		}
		return lista.toString();

	}

	public static String getRegiaoCentroOeste() {
		ArrayList<String> lista = new ArrayList<String>();
		for (EstadosBrasileiros estados : EstadosBrasileiros.values()) {
			if (estados.regiao.toString() == "CENTRO-OESTE") {
				lista.add(estados.getNome().toString());
			}
		}
		return lista.toString();

	}

}
