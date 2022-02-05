/*
 * Revisão de Programação
 * Orlewilson Maia
 * 04/02/2022
 * Exemplos de leitura e impressão de dados via console
 * 
 * */

import java.util.Scanner;

public class Exemplos {

	public static void main(String[] args) {

		// ler dados do console
		Scanner ler = new Scanner(System.in);

		String textoLido;

		System.out.println("Digite algo: ");
		textoLido = ler.nextLine();
		System.out.println("Texto lido: " + textoLido);

		System.out.println("Digite algo numérico: ");
		int numero = ler.nextInt();
		System.out.println("número lido: " + numero);

		ler.close();
	}
}
