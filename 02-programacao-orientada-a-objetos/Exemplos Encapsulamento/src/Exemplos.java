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

		Scanner valorLido = new Scanner(System.in);

		// criando um objeto a partir da classe Cachorro
		Cachorro toto = new Cachorro();

		// informando valores para cada atributo
		// antes
//		toto.acessorios = "pulseira, rel�gio";
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

//		System.out.println("Informe os acess�rios: ");
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
//		System.out.println("Informe a ra�a: ");
//		toto.setRaca(valorLido.nextLine());

		// mostrar dados do Tot�
//		antes
//		System.out.println("Acess�rios: " + toto.acessorios);
//		System.out.printf("Altura: %.2f\n", toto.altura);
//		System.out.println("Cor do Fucinho: " + toto.corFucinho);
//		System.out.printf("Peso: %.2f\n", toto.peso);
//		System.out.println("Ra�a: " + toto.raca);
//		System.out.println("Cor do Pelo: " + toto.corPelo);
		// depois
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
		
		valorLido.close();
	}
}
