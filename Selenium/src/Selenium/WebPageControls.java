package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class WebPageControls {

	
	
	
	@Test
	public void test1() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","E:\\Selenium setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        JavascriptExecutor javaScriptExecutor =(JavascriptExecutor)driver;
        javaScriptExecutor.executeScript("window.open('');");
    	driver.get("https://www.naukri.com/");
        driver.navigate().to("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("test1");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test1");
		WebElement submitButton = driver.findElement(By.xpath("//input[@name='submit']"));
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(submitButton.isEnabled());
		System.out.println("submit button is enabled: " + submitButton.isEnabled());
		submitButton.click();
		
		String parentWindowHandle=driver.getWindowHandle();
		Set<String>allWindowHandles=driver.getWindowHandles();
	    for(String str:allWindowHandles){
			if(driver.getWindowHandle()!=parentWindowHandle){
			driver.switchTo().window(str);
			System.out.println(driver.getTitle());
			driver.close();
			
			}
		}
	    
        WebElement signOffLink = driver.findElement(By.linkText("SIGN-OFF"));
		softAssert.assertEquals(signOffLink.getText(), "SIGN-OFF");
		driver.findElement(By.linkText("Flights")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		Select select = new Select(driver.findElement(By.xpath("//select[@name='toMonth']")));
		select.selectByVisibleText("January");
		softAssert.assertAll();
		System.out.println(select.isMultiple());
		
	}

	}

	



