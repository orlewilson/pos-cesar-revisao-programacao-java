import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exemplos {

	public static void main(String[] args) throws InterruptedException {

		// navegador
		WebDriver driver;

		// driver atualizados
		
		// chrome
		// https://chromedriver.chromium.org/downloads
		System.setProperty("webdriver.chrome.driver", "apps/chromedriver.exe");
		driver = new ChromeDriver();

		// firefox
		// https://github.com/mozilla/geckodriver/releases
//		System.setProperty("webdriver.gecko.driver","apps/geckodriver.exe");
//		driver = new FirefoxDriver();

		// acessa uma página web
		driver.get("https://www.google.com");
		String nomePagina = driver.getTitle();
		System.out.println("Título: " + nomePagina);

		// fecha o navegador
		driver.close();

	}
}
