package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleFramesNavigationCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(frame);
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id='app']/header/a/img")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("https://www.facebook.com/");
		//System.out.println();
	}
}
 