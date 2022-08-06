package MyPracticeSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToLaunchBrowserInSelenium2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		System.setProperty("webdriver.chrome.driver","E:\\Selenium setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://grabonz.com/");
		
		
		
	}

}
