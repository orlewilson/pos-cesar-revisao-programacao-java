import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * Revis�o de Programa��o
 * Orlewilson Maia
 * 05/02/2022
 * Exemplos de Objetos instanciados da Classe Cachorro
 * 
 * */
public class Exemplos {

	public static void main(String[] args) {

		// criando um objeto a partir da classe Cachorro
		Cachorro toto = new Cachorro();

		// mostrar dados do Tot�
		toto.setAcessorios("pulseira");
		toto.setAltura(2.3);
		toto.setCorFucinho("preto");
		toto.setPeso(2.1);
		toto.setRaca("puggie");
		toto.setCorPelo("branco");

		// mostrar dados do Tot�
		System.out.println("Acess�rios: " + toto.getAcessorios());
		System.out.printf("Altura: %.2f\n", toto.getAltura());
		System.out.println("Cor do Fucinho: " + toto.getCorFucinho());
		System.out.printf("Peso: %.2f\n", toto.getPeso());
		System.out.println("Ra�a: " + toto.getRaca());
		System.out.println("Cor do Pelo: " + toto.getCorPelo());
		// chamando os m�todos
		toto.caminhar();
		toto.correr();
		toto.escrever();
		toto.falar();
		toto.latir();
		toto.verHoras();

		// mostrar dados do Tot�2
		Cachorro toto2 = new Cachorro("preto", 2.3, "viralata", 1.2, "rel�gio", "marrom");
		System.out.println("Acess�rios: " + toto2.getAcessorios());
		System.out.printf("Altura: %.2f\n", toto2.getAltura());
		System.out.println("Cor do Fucinho: " + toto2.getCorFucinho());
		System.out.printf("Peso: %.2f\n", toto2.getPeso());
		System.out.println("Ra�a: " + toto2.getRaca());
		System.out.println("Cor do Pelo: " + toto2.getCorPelo());

	}
}
