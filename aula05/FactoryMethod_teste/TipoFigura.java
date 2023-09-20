package FactoryMethod_teste;

public enum TipoFigura {
	CIRCULO("circulo"),
	RETANGULO("retangulo"),
	TRIANGULO("triangulo");
	
	private String descricao;
	
	TipoFigura(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
