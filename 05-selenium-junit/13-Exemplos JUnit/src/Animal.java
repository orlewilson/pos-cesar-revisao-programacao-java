/*
 * Revisão de Programação
 * Orlewilson Maia
 * 18/02/2022
 * Exemplos Classe para modelar um animal
 * 
 * */
abstract class Animal {

	// atributos
	private String corPelo;
	private double peso; // quilograma
	private String raca;
	private double altura; // metros

	// construtor
	public Animal() {
		// primeira forma
//		this.corPelo = "";
//		this.peso = 0.0;
//		this.raca = "";
//		this.altura = 0.0;

		// segunda forma
		setCorPelo("branco");
		setPeso(0.0);
		setRaca("");
		setAltura(0.0);
	}

	public Animal(String corPelo, double peso, String raca, double altura) {

		// primeira forma
		this.corPelo = corPelo;
		this.peso = peso;
		this.raca = raca;
		this.altura = altura;

		// segunda forma
//		setCorPelo(corPelo);
//		setPeso(peso);
//		setRaca(raca);
//		setAltura(altura);
	}

	// métodos
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
		if (peso < 0) {
			System.out.println("Informe um valor positivo");
		} else {
			this.peso = peso;
		}
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

	// outros métodos
	public String caminhar() {
		System.out.println("caminhando...");
		return "caminhando...";
	}

	public void correr() {
		System.out.println("a definir");
	}
}
