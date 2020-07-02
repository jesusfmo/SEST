package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstLocator {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.rediff.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector(".mailicon")).click();
		
		Boolean isPresent = driver.findElements(By.xpath("//input[@name='proceed']")).size() > 0;
		
		System.out.print(isPresent);
		
		driver.close();
		

	}

}
