package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\praga\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();

		// cssSelector---> (id)
		driver.findElement(By.cssSelector("#fullName"));

		// cssSelector---> (Element and id)
		driver.findElement(By.cssSelector("input#fullName"));

		// cssSelector---> (class)
		driver.findElement(By.cssSelector(".input"));

		// cssSelector---> (Element and class)
		driver.findElement(By.cssSelector("input.input"));

		// cssSelector---> (attribute)
		driver.findElement(By.cssSelector("[id=fullName]"));

		// cssSelector---> (Element, attribute)
		driver.findElement(By.cssSelector("input[id=fullName]"));

		// cssSelector---> (Element, class, attribute)
		driver.findElement(By.cssSelector("input.input[id=fullName]"));
		
	}

}
