/*
 * Revis�o de Programa��o
 * Orlewilson Maia
 * 04/02/2022
 * Exemplos de tipos primitivos em Java.
 * 
 * */

public class Exemplos {

	public static void main(String[] args) {

		// declara��o de vari�veis
		boolean a = false;
		int b, c;
		b = 2;
		c = 3;

		double d = 2.2;
		float e = 3.2f;
		short f = 2;

		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
		System.out.println("e: " + e);
		System.out.println("f: " + f);

		// valor formatado
		double pi = 3.1415;
		System.out.printf("pi: %.3f\n", pi);

		char g = 'g';

		// Tipo String
		String nome = "Orlewilson";

		System.out.println("Nome: " + nome);
		System.out.println("Tamanho: " + nome.length());
		System.out.println("Caracter posi��o 2: " + nome.charAt(2));
		System.out.println("Compara��o: " + (nome.compareTo("Orlewilson") == 0));
		System.out.println("Compara��o: " + nome.equals("Orlewilson"));
	}
}