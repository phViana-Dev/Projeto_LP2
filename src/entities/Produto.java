package entities;

import java.util.Random;

public class Produto {

		protected Integer codigo;
		protected Double preco;
		protected String marca;
		protected String modelo;
		
		public Produto() {
			
		}

		public Produto(Double preco, String marca, String modelo) {
			this.preco = preco;
			this.marca = marca;
			this.modelo = modelo;
		}

		public Double getPreco() {
			return preco;
		}

		public String getMarca() {
			return marca;
		}

		public String getModelo() {
			return modelo;
		}
		
		public Integer getCodigo() {
			return codigo;
		}
		
		public int gerarCodigo() {
			Random random = new Random();
			return random.nextInt(900000) + 100000;
		}
}
