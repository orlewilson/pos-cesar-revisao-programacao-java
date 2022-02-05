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
		
		// informando valores para cada atributo
		toto.acessorios = "pulseira, rel�gio";
		toto.altura = 1.2;
		toto.corFucinho = "preto";
		toto.corPelo = "amarelo";
		toto.peso = 3.5;
		toto.raca = "viralata";
		
		// mostrar dados do Tot�
		System.out.println("Acess�rios: " + toto.acessorios);
		System.out.printf("Altura: %.2f\n", toto.altura);
		System.out.println("Cor do Fucinho: " + toto.corFucinho);
		System.out.println("Cor do Pelo: " + toto.corPelo);
		System.out.printf("Peso: %.2f\n", toto.peso);
		System.out.println("Ra�a: " + toto.raca);
		
		// chamando os m�todos
		toto.caminhar();
		toto.correr();
		toto.escrever();
		toto.falar();
		toto.latir();
		toto.verHoras();	
	}
}
