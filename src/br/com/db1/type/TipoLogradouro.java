package br.com.db1.type;

public enum TipoLogradouro {

	RUA("rua", "R."), PRACA("Praça", "Pc."), FAZENDA("Fazenda", "Fz."), AVENIDA(
			"Avenida", "Av.");

	String descricaoLogradouto;
	String siglaLogradouro;

	TipoLogradouro(String descricao, String sigla) {
		descricaoLogradouto = descricao;
		siglaLogradouro = sigla;
	}

	public String getDescricaoLogradouto() {
		return descricaoLogradouto;
	}

	public String getSiglaLogradouro() {
		return siglaLogradouro;
	}
}
