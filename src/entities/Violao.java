package entities;

import java.util.List;

import Enum.CoresEnum;

public class Violao extends Produto{
	
	private Integer quantidadeDeCordas;
	private String tipo;
	
	public Violao(CoresEnum cor, Double preco, String marca, String modelo, Integer quantidadeDeCordas,
			String tipo) {
		super(cor, preco, marca, modelo);
		this.quantidadeDeCordas = quantidadeDeCordas;
		this.tipo = tipo;
	}


	public Integer getQuantidadeDeCordas() {
		return quantidadeDeCordas;
	}
		
}
