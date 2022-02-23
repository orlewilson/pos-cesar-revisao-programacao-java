import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.AfterClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class TestJUnitSelenium {

	public WebDriver driver;

	@BeforeEach
	public void setUpTest() {
		// Firefox
//		System.setProperty("webdriver.gecko.driver", "apps/geckodriver.exe");
//		driver = new FirefoxDriver();

		// Chrome
		System.setProperty("webdriver.chrome.driver", "apps/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@AfterEach
	public void teadDownTest() {
		driver.quit();
	}

	@Test
	@DisplayName("Verificar o título da página")
	public void testTitulo() {
		driver.get("https://google.com/");
		String title = driver.getTitle();
		assertTrue(title.compareTo("Google") == 0, "Título não corresponde");
	}

	@Test
	@DisplayName("Pesquisar palavra Cesar School")
	public void testPesquisa() {
		driver.get("https://google.com/");
		
		// busca pela palavra Cesar School
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Cesar School");
		search.submit();

		// aguarda até 10 segundos
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// obtém elemento do body
		WebElement bodyTag = driver.findElement(By.tagName("body"));

		assertTrue(bodyTag.getText().contains("CESAR School: Início"), "Página não encontrada");
	}
}
