package week3.day2;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws AWTException, InterruptedException {
		//Setting up chrome driver
		WebDriverManager.chromedriver().setup();
		
		//Handling Popup Notifications
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		
		//Providing URL
		driver.get("https://www.amazon.in/");
		
		//Maximizing window
		driver.manage().window().maximize();
		
		//Providing implicit wait condition
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Searching Mobiles below 5000 and clicking the first product.
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles below 5000");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[contains(@class,'a-size-medium a-color-base')]")).click();
		
		//After clicking the product new tab is opened, so we are getting the handle of window and passing the control to it.
		Set<String> allWindows = driver.getWindowHandles();
		List<String> handle = new ArrayList();
		for (String string : allWindows) {
			handle.add(string);
			}
		String a = handle.get(1);
		driver.switchTo().window(a);
		
		//Adding Item to cart and proceeding to checkout
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.name("proceedToRetailCheckout")).click();
		
		//Closing the Browser
		driver.quit();
		
	}}
