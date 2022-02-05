/*
 * Revisão de Programação
 * Orlewilson Maia
 * 04/02/2022
 * Exemplos de operadores aritméticos, relacionais e lógicos
 * 
 * */
public class Exemplos {

	public static void main(String[] args) {
		int a, b, c, d;
		a = 10;
		b = 5;
		c = 4;
		d = 34;

		// operadores aritméticos
		System.out.println("a + b: " + (a + b));
		System.out.println("c - d: " + (c - d));
		System.out.println("a / b: " + (a / b));
		System.out.println("b % c: " + (b % c));

		// operadores relacionais
		System.out.println("b > c: " + (b > c));
		System.out.println("b < c: " + (b < c));
		System.out.println("b <= b: " + (b <= b));
		System.out.println("a >= b: " + (a >= b));
		System.out.println("b == b: " + (b == b));
		System.out.println("a != b: " + (a != b));

		// operadores lógicos (&&, ||, !)
		System.out.println("b > c && a < d: " + (b > c && a < d));
		System.out.println("b > c || a > d: " + (b > c || a > d));
		System.out.println("!(b > c): " + !(b > c));
	}
}
