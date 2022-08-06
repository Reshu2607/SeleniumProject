package Selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToLaunchBrowserInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://grabonz.com/");
		
		driver.manage().window().maximize();
		WebElement element= driver.findElement(By.xpath("//button[@class='btn--link site-header__icon site-header__search-toggle js-drawer-open-top']"));
		element.click();
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		searchBox.sendKeys("T-shirt");
		Thread.sleep(5000);
		searchBox.clear();
		Thread.sleep(5000);
		searchBox.sendKeys("shirts");
		List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		list.stream().forEach((t)->System.out.print(t.getAttribute("href")));
		driver.close();
		driver.quit();
	//	driver.findElement(By.id("navbarDropdown")).click();
	//	driver.findElement(By.className("classNAme"));
	//  driver.findElement(By.xpath("//button[@class='DocSearchDocSearch-Button']")).click();
	//	driver.findElement(By.tagName("button")).click();
	//  driver.findElement(By.linkText("Home")).click();
	//	driver.findElement(By.partialLinkText("Hom")).click();
	//	driver.findElement(By.cssSelector("body > div > main >div.row.justify-content-center.my-1 > div > div > a")).click();
	//  driver.findElement(By.name("name"));
	}

}
