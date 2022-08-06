package Selenium;

import java.sql.Driver;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HowToHandleAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(6));
		
		
		//wait.until(ExpectedConditions.alertIsPresent());
		
		FluentWait<WebDriver> fluentWait=new FluentWait<WebDriver>(driver);
		fluentWait.withTimeout(Duration.ofSeconds(5));
		fluentWait.pollingEvery(Duration.ofSeconds(5));
		fluentWait.ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.alertIsPresent());
		
		//wait.until(ExpectedConditions.alertIsPresent());
		
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
		
	}

}
