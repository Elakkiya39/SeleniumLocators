package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praga\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();

		//Selenium Locators
		//1.id
		driver.findElement(By.id("fullName"));
		//2.name
		driver.findElement(By.name("aswift_4"));
		//3.className
		driver.findElement(By.className("card-footer-item"));
		//4.xpath
		driver.findElement(By.xpath("//*[@id='fullName']"));
		//5.cssSelector
		driver.findElement(By.cssSelector("#fullName"));
		//6.linkText
		driver.findElement(By.linkText("Bollineni Lakshmi Yaswanth"));
		//7.partialLinkText
		driver.findElement(By.partialLinkText("Bollineni "));
		//8.tagName
		driver.findElement(By.tagName("input"));
	}

}
