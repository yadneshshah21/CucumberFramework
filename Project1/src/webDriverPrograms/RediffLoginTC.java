package webDriverPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RediffLoginTC {

	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse projects\\Jar files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("abc@rediffmail.com");
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("pass123");
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.linkText("Home")).click();
		
		String expected = "http://www.rediff.com/";
		
		String actual = driver.getCurrentUrl();
		System.out.println(actual);
		
		Assert.assertEquals(actual, expected);
		
	}
	
}
