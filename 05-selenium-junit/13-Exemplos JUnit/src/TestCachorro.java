import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TestCachorro {

	public Cachorro toto;
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	// antes de cada teste
	@BeforeEach
	public void setUpTest() {
		toto = new Cachorro();
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	// teste em si
	@Test
	@DisplayName("Verificar a altura do objeto toto")
	public void testAltura() {
		toto.setAltura(2.1);
		assertTrue(toto.getAltura() == 2.1, "Altura não corresponde");
	}

	@Test
	@DisplayName("Verificar peso com valor negativo")
	public void testPesoNegativo() {
		toto.setPeso(-1);
		assertTrue(toto.getPeso() == 0.0, "Peso não corresponde");
	}

	@DisplayName("Verificar peso com valores inteiros negativos")
	@ParameterizedTest
	@ValueSource(ints = { -1, -3, -5, -8, Integer.MIN_VALUE })
	void testPesoValoresNegativos(int peso) {
		System.out.println(peso);
		toto.setPeso(peso);
		assertTrue(toto.getPeso() == 0.0, "Peso não corresponde");
	}

	@DisplayName("Verificar peso com valores inteiros negativos")
	@ParameterizedTest
	@ValueSource(doubles = { 1.6, 3.8, 5.5, 3.2, 15.3 })
	void testPesoValoresPositivos(double peso) {
		System.out.println(peso);
		toto.setPeso(peso);
		assertTrue(toto.getPeso() == peso, "Peso não corresponde");
	}

	@Test
	@DisplayName("Verificar polimorfismo caminhar")
	public void testCaminhar() {
		assertTrue(toto.caminhar().equals("caminhando com o dono.."), "Mensagem não corresponde");
	}

	@Test
	@DisplayName("Verificar polimorfismo correr")
	public void testcorrer() {
		toto.correr();
		assertEquals("correndo atrás do motoqueiro", outputStreamCaptor.toString().trim());
	}

	@Test
	@DisplayName("Verificar palavraa contida na saida do print")
	void VerificarPrintCorrerContido() {
		toto.latir();
		assertTrue(outputStreamCaptor.toString().contains("au, au!"));
	}

	// após os testes
	@AfterEach
	public void tearDownTest() {
		toto = null;
	}
}
