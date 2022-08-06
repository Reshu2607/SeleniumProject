package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HowToscrollInSelenium {

	@Test
	public void scrolltoend()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement brandDirectory=driver.findElement(By.linkText("Brand Directory"));
		JavascriptExecutor javascriptExicutor = (JavascriptExecutor)driver;
//      ((JavascriptExecutor)driver).executeScript("window.open('https://google.com')");
		javascriptExicutor.executeScript("arguments[0].scrollIntoView(true);",brandDirectory);
		
		
		
//		javascriptExicutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	
	
	
	
	
	
	
	
	
}
