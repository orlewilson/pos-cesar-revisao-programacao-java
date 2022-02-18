import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * Revisão de Programação
 * Orlewilson Maia
 * 05/02/2022
 * Exemplos de Objetos instanciados da Classe Cachorro
 * 
 * */
public class Exemplos {

	public static void main(String[] args) {

		// criando um objeto a partir da classe Cachorro
		Cachorro toto = new Cachorro();

		// mostrar dados do Totó
		toto.setAcessorios("pulseira");
		toto.setAltura(2.3);
		toto.setCorFucinho("preto");
		toto.setPeso(2.1);
		toto.setRaca("puggie");
		toto.setCorPelo("branco");

		// mostrar dados do Totó
		System.out.println("Acessórios: " + toto.getAcessorios());
		System.out.printf("Altura: %.2f\n", toto.getAltura());
		System.out.println("Cor do Fucinho: " + toto.getCorFucinho());
		System.out.printf("Peso: %.2f\n", toto.getPeso());
		System.out.println("Raça: " + toto.getRaca());
		System.out.println("Cor do Pelo: " + toto.getCorPelo());
		// chamando os métodos
		toto.caminhar();
		toto.correr();
		toto.escrever();
		toto.falar();
		toto.latir();
		toto.verHoras();

		// mostrar dados do Totó2
		Cachorro toto2 = new Cachorro("preto", 2.3, "viralata", 1.2, "relógio", "marrom");
		System.out.println("Acessórios: " + toto2.getAcessorios());
		System.out.printf("Altura: %.2f\n", toto2.getAltura());
		System.out.println("Cor do Fucinho: " + toto2.getCorFucinho());
		System.out.printf("Peso: %.2f\n", toto2.getPeso());
		System.out.println("Raça: " + toto2.getRaca());
		System.out.println("Cor do Pelo: " + toto2.getCorPelo());

	}
}
