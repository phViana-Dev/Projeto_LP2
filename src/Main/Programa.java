package Main;

import java.util.Scanner;

import Enum.OpcoesEnum;
import entities.Iniciar;
import entities.MontandoLoja;

public class Programa {

	public static void main(String[] args) {
					
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Seja bem indo a xxxxx Musical!");
		System.out.println("Trabalhamos com venda de Violão, Guitarra, Violino, Cavaco");
		Iniciar.iniciar();
		
		if(Iniciar.iniciar() == 0) {
			//codigo vendendor		
		}
		else {
			//codigo cliente
		}
		
		sc.close();
	}
}
