/*
 * Revisão de Programação
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

	// métodos
	public void latir() {
		System.out.println("au, au!");
	}

	public void falar() {
		System.out.println("Auuu, late coração...");
	}

	public void escrever() {
		System.out.println("turma arretada!");
	}

	public void caminhar() {
		System.out.println("caminhando...");
	}

	public void correr() {
		System.out.println("correndo atrás do motoqueiro");
	}

	public void verHoras() {
		System.out.println("São 15h");
	}
}
