
/*
 * Revisão de Programação
 * Orlewilson Maia
 * 05/02/2022
 * Exemplos vetores 
 * 
 * */
import java.util.Scanner;

public class Exemplos {

	public static void main(String[] args) {

		// declaração de vetores (unidimensional)
		int[] notas = new int[3];

		Scanner lerNota = new Scanner(System.in);

		// leitura de notas
		for (int cont = 0; cont < 3; cont++) {
			System.out.println("Digite a nota " + (cont + 1) + ": ");
			notas[cont] = lerNota.nextInt();
		}

		// mostrar notas lidas
		for (int cont = 0; cont < 3; cont++) {
			System.out.println("Nota " + (cont + 1) + ": " + notas[cont]);
		}

		// declaração de vetores multidimensional
		int[][] matriz = new int[3][3];
		matriz[0][0] = 1;

		// criando e inicializando o vetor multidimensional
		int[][] matriz2 = { { 1, 2, 3 }, { 4, 5, 6 } };

		int[] vetor1 = new int[3];
		vetor1[0] = 1;

		// criando e inicializando o vetor unidimensional
		int[] vetor2 = { 1, 2, 3, 4, 5, 6 };

		// conhecer o tamanho do vetor usando a propriedade length
		System.out.println("tamanho vetor1: " + vetor1.length);
		System.out.println("tamanho vetor2: " + vetor2.length);

		System.out.println("tamanho vetor2[0]: " + vetor2[0]);
		vetor2[0] = 7;
		System.out.println("tamanho vetor2[0]: " + vetor2[0]);
	}
}
