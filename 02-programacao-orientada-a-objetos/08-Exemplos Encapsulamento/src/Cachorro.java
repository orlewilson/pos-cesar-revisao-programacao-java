/*
 * Revisão de Programação
 * Orlewilson Maia
 * 05/02/2022
 * Exemplos Classe para modelar um cachorro
 * 
 * */

public class Cachorro {

	// atributos
	private String corPelo;
	private double peso; // quilograma
	private String acessorios;
	private String raca;
	private double altura; // metros
	private String corFucinho;

	// gets e sets para cada atributo
	public void setCorPelo(String corPelo) {
		if (corPelo.equals("")) {
			System.out.println("Informar algum conteúdo para Cor do Pelo!");
		} else {
			this.corPelo = corPelo;
		}
	}

	public String getCorPelo() {
		return this.corPelo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(String acessorios) {
		this.acessorios = acessorios;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getCorFucinho() {
		return corFucinho;
	}

	public void setCorFucinho(String corFucinho) {
		this.corFucinho = corFucinho;
	}

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
