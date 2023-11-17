package entities;

import java.util.Scanner;

public class Iniciar {
	
	public static int iniciar() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a opção que você deseja: ");
		System.out.println("0 - Vendedor");
		System.out.println("1 - Cliente");
					
		System.out.print("0/1: ");
		
		int opcao = sc.nextInt();
		
		switch(opcao) {
		case 0:
			System.out.println("Vendedor");
			break;
		case 1:
			System.out.println("Cliente");
			break;
		default:
			System.out.println("Opção inválida");
			iniciar();
		}
		sc.close();
		return opcao;
	}
	
}
