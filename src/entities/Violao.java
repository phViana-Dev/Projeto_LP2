package entities;

import java.util.List;

public class Violao extends Produto{
	
	private Integer quantidadeDeCordas;
	private String tipo;

	public Violao(Double preco, String marca, String modelo, Integer quantidadeDeCordas, String tipo) {
		super(preco, marca, modelo);
		this.quantidadeDeCordas = quantidadeDeCordas;
		this.tipo = tipo;
		
	}

	public Integer getQuantidadeDeCordas() {
		return quantidadeDeCordas;
	}
		
}
