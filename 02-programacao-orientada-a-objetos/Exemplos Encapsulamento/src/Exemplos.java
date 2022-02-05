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

		Scanner valorLido = new Scanner(System.in);

		// criando um objeto a partir da classe Cachorro
		Cachorro toto = new Cachorro();

		// informando valores para cada atributo
		// antes
//		toto.acessorios = "pulseira, relógio";
//		toto.altura = 1.2;
//		toto.corFucinho = "preto";
//		toto.peso = 3.5;
//		toto.raca = "viralata";
//		toto.corPelo = "amarelo";
		// depois
//		System.out.println("Informe a cor do pelo: ");
//		toto.setCorPelo(valorLido.nextLine());
		
//		String corPelo = JOptionPane.showInputDialog("Informe a cor do pelo");
//		toto.setCorPelo(corPelo);

//		System.out.println("Informe os acessórios: ");
//		toto.setAcessorios(valorLido.nextLine());
		
		System.out.println("Informe a altura: ");
		toto.setAltura(Double.parseDouble(valorLido.nextLine().replace(',','.')));
		
//		double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));
//		toto.setAltura(altura);
		
//		System.out.println("Informe a cor fucinho: ");
//		toto.setCorFucinho(valorLido.nextLine());
//		
//		System.out.println("Informe o peso: ");
//		toto.setPeso(Double.parseDouble(valorLido.nextLine()));
//		
//		System.out.println("Informe a raça: ");
//		toto.setRaca(valorLido.nextLine());

		// mostrar dados do Totó
//		antes
//		System.out.println("Acessórios: " + toto.acessorios);
//		System.out.printf("Altura: %.2f\n", toto.altura);
//		System.out.println("Cor do Fucinho: " + toto.corFucinho);
//		System.out.printf("Peso: %.2f\n", toto.peso);
//		System.out.println("Raça: " + toto.raca);
//		System.out.println("Cor do Pelo: " + toto.corPelo);
		// depois
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
		
		valorLido.close();
	}
}
