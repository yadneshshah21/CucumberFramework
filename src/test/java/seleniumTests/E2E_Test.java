package seleniumTests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class E2E_Test {

	WebDriver driver;
	@Test
	public void e2etest() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse projects\\Jar files\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("http://www.shop.demoqa.com");
		
		Thread.sleep(3000);
		driver.navigate().to("http://shop.demoqa.com/?s=" + "dress" + "&post_type=product");
		
		Thread.sleep(3000);
		
		List<WebElement> items = driver.findElements(By.cssSelector(".noo-product-inner"));
		items.get(0).click();
		
		WebElement addToCart = driver.findElement(By.cssSelector("button.single_add_to_cart_button"));
		addToCart.click();		
		
		
		WebElement cart = driver.findElement(By.cssSelector(".cart-button"));
		cart.click();
		
		WebElement continueToCheckout = driver.findElement(By.cssSelector(".checkout-button.alt"));
		continueToCheckout.click();		
		
		
		Thread.sleep(5000);
		WebElement firstName = driver.findElement(By.cssSelector("#billing_first_name"));
		firstName.sendKeys("Lakshay");
		
		WebElement lastName = driver.findElement(By.cssSelector("#billing_last_name"));
		lastName.sendKeys("Sharma");
		
		WebElement emailAddress = driver.findElement(By.cssSelector("#billing_email"));
		emailAddress.sendKeys("test@gmail.com");
		
		WebElement phone = driver.findElement(By.cssSelector("#billing_phone"));
		phone.sendKeys("07438862327");
				
		WebElement countryDropDown = driver.findElement(By.cssSelector("#billing_country_field .select2-arrow"));
		countryDropDown.click();
		Thread.sleep(2000);
		
		List<WebElement> countryList = driver.findElements(By.cssSelector("#select2-drop ul li"));
		for(WebElement country : countryList){
			if(country.getText().equals("India")) {
				country.click();	
				Thread.sleep(3000);
				break;
			}		
		}
						
		WebElement city = driver.findElement(By.cssSelector("#billing_city"));
		city.sendKeys("Delhi");
		
		WebElement address = driver.findElement(By.cssSelector("#billing_address_1"));
		address.sendKeys("Shalimar Bagh");
		
		WebElement stateDropDown = driver.findElement(By.id("select2-chosen-2"));
		stateDropDown.click();
		Thread.sleep(2000);
		
		List<WebElement> stateList = driver.findElements(By.cssSelector("#select2-results-2"));
		for(WebElement state : stateList){
			if(state.getText().equals("Delhi")) {
				state.click();	
				Thread.sleep(3000);
				break;
			}		
		}
		
		
		WebElement postcode = driver.findElement(By.cssSelector("#billing_postcode"));
		postcode.sendKeys("110088");		
		
//		WebElement shipToDifferetAddress = driver.findElement(By.cssSelector("#ship-to-different-address-checkbox"));
//		shipToDifferetAddress.click();
//		Thread.sleep(3000);
		
//		List<WebElement> paymentMethod = driver.findElements(By.cssSelector("ul.wc_payment_methods li"));
//		paymentMethod.get(0).click();
		
		Thread.sleep(2000);
		WebElement acceptTC = driver.findElement(By.id("terms"));
		acceptTC.click();
		
		WebElement placeOrder = driver.findElement(By.id("place_order"));
		placeOrder.submit();
		
		
		
		driver.quit();
	}
	
}
