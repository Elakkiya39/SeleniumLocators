package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praga\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		// LOCATING WITH RESPECT TO ELEMENT AND ATTRIBUTE
		// 1.Locating element with known attribute
		driver.findElement(By.xpath("//*[@name='username']"));
		
		// 2.Locating element with known element and attribute
		driver.findElement(By.xpath("//input[@name='username']"));
		
		// 3.Locating element with known visible text(exact match)
		driver.findElement(By.xpath("//p[text()='Forgot your password? ']"));
		
		// 4.Locating element when part of the visible text is known
		driver.findElement(By.xpath(""));//p[contains(text(),'Forgot your ')]--->(https://letcode.in/edit)
		
		// 5.Locating element with multiple attribute
		driver.findElement(By.xpath("//input[@name='username'][@placeholder='Username']"));
		
		// 6.Locating element when starting visible text is known
		driver.findElement(By.xpath(""));//label[starts-with(text(),'Clear the ')]--->(https://letcode.in/edit)
		
		// 7.Locating element with dynamic attribute values
		driver.findElement(By.xpath("//input[contains(@name,'user')]"));
		
		

		// LOCATING ELEMENTS RELATIVE TO KNOWN ELEMENT
		// 1.Locating a parent element
		driver.findElement(By.xpath("//input[@name='username']//parent::div"));
		
		// 2.Locating a child element
		driver.findElement(By.xpath("//div[@class='oxd-form-row']//child::*"));
		
		// 3.Locating ancestor of a known element
		driver.findElement(By.xpath("//p[text()='Password : admin123']//ancestor::div"));
		
		// 4.Locating following element
		driver.findElement(By.xpath("//p[text()='Username : Admin']//following::*"));
		
		// 5.Locating preceding element
		driver.findElement(By.xpath("//p[text()='Password : admin123']//preceding::p"));
		
		// 6.Locating following-sibling element
		driver.findElement(By.xpath("//p[text()='Username : Admin']//following-sibling::*"));
		
		// 7.Locating preceding-sibling element
		driver.findElement(By.xpath("//p[text()='Password : admin123']//preceding-sibling::*"));
		
	}

}
