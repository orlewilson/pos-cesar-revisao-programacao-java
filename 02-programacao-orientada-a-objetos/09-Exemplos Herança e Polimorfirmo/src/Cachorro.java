/*
 * Revisão de Programação
 * Orlewilson Maia
 * 18/02/2022
 * Exemplos Classe para modelar um cachorro herdando da classe animal
 * 
 * */

public class Cachorro extends Animal {

	// atributos
	private String acessorios;
	private String corFucinho;

	// construtores
	public Cachorro() {
//		// terceira
//		super();
//		this.acessorios = "";
//		this.corFucinho = "";
//		setAcessorios("");
//		setCorFucinho("");
//		
//		// quarta
		super("", 0.0, "", 0.0);
//		this.acessorios = "";
//		this.corFucinho = "";
		setAcessorios("");
		setCorFucinho("");

		// primeira forma
//		this.acessorios = "";
//		this.corFucinho = "";
//		setCorPelo("branco");
//		setPeso(0.0);
//		setRaca("");
//		setAltura(0.0);
//		
		// segunda forma
//		setCorPelo("branco");
//		setPeso(0.0);
//		setRaca("");
//		setAltura(0.0);
//		setAcessorios("");
//		setCorFucinho("");
	}

	public Cachorro(String corPelo, double peso, String raca, double altura, String acessorios, String corFucinho) {

		// terceira forma
		super(corPelo, peso, raca, altura);
//		this.acessorios = acessorios;
//		this.corFucinho = corFucinho;
		setAcessorios(acessorios);
		setCorFucinho(corFucinho);

		// primeira forma
		this.acessorios = acessorios;
		this.corFucinho = corFucinho;
		setCorPelo(corPelo);
		setPeso(peso);
		setRaca(raca);
		setAltura(altura);

		// segunda forma
		setCorPelo(corPelo);
		setPeso(peso);
		setRaca(raca);
		setAltura(altura);
		setAcessorios(acessorios);
		setCorFucinho(corFucinho);
	}

	// gets e sets para cada atributo
	public String getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(String acessorios) {
		this.acessorios = acessorios;
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

	public void escrever(String palavra) {
		System.out.println("turma arretada!" + palavra);
	}

	public void verHoras() {
		System.out.println("São 15h");
	}

	// polimorfismo (sobreescrita)
	public void caminhar() {
		System.out.println("caminhando com o dono..");
	}

	public void correr() {
		System.out.println("correndo atrás do motoqueiro");
	}
}
