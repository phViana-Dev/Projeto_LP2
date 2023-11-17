package entities;

import java.util.List;

public class MontandoLoja {
	
	public static void cadastrarViolao(List<Produto> estoque, double preco, String marca, String modelo, int quantidadeDeCordas, String tipo) {
		for(int i = 0; i < 11; i++) {
			Produto produto = new Violao(preco, marca, modelo, quantidadeDeCordas, tipo);
			produto.codigo = produto.gerarCodigo();
			estoque.add(produto);
		}
	}
	
	public static void cadastrarViolino(/* parametros */){
		
	}
	
	public static void cadastrarGuitarra(/* parametros */) {
		
	}
	
	public static void cadastrarCavaco(/* parametros */) {
		
	}
			
}
