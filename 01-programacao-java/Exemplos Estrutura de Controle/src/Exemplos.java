
/*
 * Revisão de Programação
 * Orlewilson Maia
 * 05/02/2022
 * Exemplos de Estruturas de Controle 
 * 
 * */
import java.util.Scanner;

public class Exemplos {

	public static void main(String[] args) {

		Scanner lerConsole = new Scanner(System.in);

		System.out.println("Digite algum número");
		int numero = lerConsole.nextInt();

		if (numero >= 50) {
			System.out.println("número é maior ou igual a 50");
		} else if (numero >= 20 && numero <= 30) {
			System.out.println("número está entre 20 e 30");
		} else {
			System.out.println("outro número");
		}

		lerConsole.close();

		switch (numero) {
		case 50:
			System.out.println("número é igual a 50");
			break;
		case 60:
			System.out.println("número é igual a 60");
			break;
		default:
			System.out.println("outro número");
		}

		int cont = 0;
//		cont2++ == cont2 = cont2 + 1

		System.out.println("For");
		for (int cont2 = 0; cont2 < 10; cont2++) {
			System.out.println(cont2);
		}

		for (cont = 0; cont < 10; cont++) {
			System.out.println(cont);
		}

		for (cont = 10; cont >= 0; cont--) {
			System.out.println(cont);
		}

		System.out.println("While");
		cont = 0;
		while (cont < 10) {
			System.out.println(cont);
			cont++;
		}

		System.out.println("Do While");
		cont = 0;
		do {
			System.out.println(cont);
			cont++;
		} while (cont < 10);
	}
}