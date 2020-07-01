package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		
		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\IB Work\\Documents\\Jar\\chromedriver.exe");
		// El punto de arriba es en caso de necesitar el driver de chrome
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		// Esta opción (user.dir) es para referisrse a un archivo dentro del proyecto
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		// Para añadir la descripcion de elementos, ir a Project--Properities--  Java Build Path -- Add source a cada una
	}

}
