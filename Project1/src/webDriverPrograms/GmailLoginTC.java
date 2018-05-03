package webDriverPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GmailLoginTC {
	
//	@BeforeTest
//	public void beforeLogin() 
//	{
//		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse projects\\Jar files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");	
//	}
//	WebDriver driver;
	
	@Test(priority = 1)
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse projects\\Jar files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("y@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("*****");
		driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
		System.out.println("Login Success");
	
		driver.findElement(By.xpath("//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")).click();
	}
	
//	@Test(priority = 2)
//	public void logout()
//	{
//		
//	}

}
