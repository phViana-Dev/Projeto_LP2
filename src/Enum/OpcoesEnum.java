package Enum;

public enum OpcoesEnum {
	VIOLAO(0),
	GUITARRA(1),
	VIOLINO(2),
	CAVACO(3);

	private int opcao;
	
	OpcoesEnum(int opcao) {
		this.opcao = opcao;
	}
	
	public int getOpcao() {
		return this.opcao;
	}
}