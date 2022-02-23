/*
 * Revis�o de Programa��o
 * Orlewilson Maia
 * 05/02/2022
 * Exemplos Classe para modelar um cachorro
 * 
 * */

public class Cachorro {

	// atributos
	public String corPelo;
	public double peso; // quilograma
	public String acessorios;
	public String raca;
	public double altura; // metros
	public String corFucinho;

	// m�todos
	public void latir() {
		System.out.println("au, au!");
	}

	public void falar() {
		System.out.println("Auuu, late cora��o...");
	}

	public void escrever() {
		System.out.println("turma arretada!");
	}

	public void caminhar() {
		System.out.println("caminhando...");
	}

	public void correr() {
		System.out.println("correndo atr�s do motoqueiro");
	}

	public void verHoras() {
		System.out.println("S�o 15h");
	}
}
