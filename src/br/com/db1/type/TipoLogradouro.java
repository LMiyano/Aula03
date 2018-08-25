package br.com.db1.type;

public enum TipoLogradouro {

	ACAMPAMENTO("ACAMP","Acampamento"),
	ACESSO("AC","Acesso"),
	ADRO("AD","Adro"),	
	AEROPORTO("ERA","Aeroporto"),
	ALAMEDA("AL","Alameda"),
	ALTO("AT","Alto"),
	AREA("A","Area"),
	AREA_ESPECIAL("AE","Area especial"),
	ARTERIA("ART","Arteria"),
	ATALHO("ATL","Atalho"),
	AVENIDA("AV","Avenida"),
	AVENIDA_CONTORNO("AV-CONT","Avenida contorno"),
	BAIXA("BX","Baixa"),
	BALAO("BLO","Balao"),
	BALNEARIO("BAL","Balneario"),
	BECO("BC","Beco"),
	BELVEDERE("BELV","Belvedere"),
	BLOCO("BL","Bloco"),
	BOSQUE("BSQ","Bosque"),
	BOULEVARD("BVD","Boulevard"),
	BURACO("BCO","Buraco"),
	CAIS("C","Cais"),
	CALCADA("CALC","Calcada"),
	CAMINHO("CAM","Caminho"),
	CAMPO("CPO","Campo"),
	CANAL("CAN","Canal"),
	CHACARA("CHAP","Chacara"),
	CHAPADAO("CHAP","Chapadao"),
	CIRCULAR("CIRC","Circular"),
	COLONIA("COL","Colonia"),
	COMPLEXO_VIARIO("CMP-VR","Complexo viario"),
	CONDOMINIO("COND","Condominio"),
	CONJUNTO("CJ","Conjunto"),
	CORREDOR("COR","Corredor"),
	CORREGO("CRG","Corrego"),
	DESCIDA("DSC","Descida"),
	DESVIO("DSV","Desvio"),
	DISTRITO("DT","Distrito"),
	ELEVADA("EVD","Elevada"),
	ENTRADA_PARTICULAR("ENT-PART","Entrada particular"),
	ENTRE_QUADRA("EQ","Entre quadra"),
	ESCADA("ESC","Escada"),
	ESPLANADA("ESP","Esplanada");

	String descricaoLogradouto;
	String siglaLogradouro;

	TipoLogradouro(String sigla, String descricao) {
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
