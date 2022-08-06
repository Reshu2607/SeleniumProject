package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HowToScrollInSeleniumAndHandleMultipleWindows {
	
	
	
	@Test
	public void scrollToEnd() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium setup\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com");

	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	WebElement brandDirectory = driver.findElement(By.linkText("Brand Directory"));
	JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
	((JavascriptExecutor) driver).executeScript("window.open(arguments[0])", "https://www.google.com");
	javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", brandDirectory);
	Thread.sleep(5000);
	
//	javascriptExicutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	String parentWindowHandle = driver.getWindowHandle();
	System.out.println("Parent window handle"+parentWindowHandle);
	Set<String> allWindowHandles = driver.getWindowHandles();
	System.out.println(allWindowHandles);
	for (String str : allWindowHandles) {
		if (str != parentWindowHandle) {
			Thread.sleep(5000);
			driver.switchTo().window(str);
			System.out.println(driver.getTitle());
			driver.close();
			break;

}
}
}
}
