package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEdriver {

	public static void main(String[] args) {
		
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();

	}

}
