package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Ajio {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//input[@class='react-autosuggest__input react-autosuggest__input--open'])[1]")).sendKeys("bags");
		try {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(200);
	}
		catch(Exception e){
			System.out.println(e);
		}
		driver.findElement(By.xpath("//input[@id='Men']/following-sibling::label[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Men - Fashion Bags']/following-sibling::label[1]")).click();
		Thread.sleep(2000);
		String itemsFound = driver.findElement(By.className("length")).getText();
		
		System.out.println("Count of the items Found :"+itemsFound.substring(0,3));
		//String wILDHORN = driver.findElement(By.xpath("//div[@class='brand']")).getText();
		
		List<WebElement> brandName = driver.findElements(By.xpath("//div[@class='brand']"));
		Set<String> brandSet = new LinkedHashSet<String>();
		for (WebElement webElement : brandName) {
			String name = webElement.getText();
			brandSet.add(name);
		}
		System.out.println(" ");
		System.out.println("List of Brands :");
		System.out.println(" ");
		for (String string : brandSet) {
			System.out.print(string+" "+",");
		}
		Thread.sleep(5000);
		System.out.println('\n'+" "+'\n'+"List of Bag Names :"+'\n'+" ");
		List<WebElement> bagName = driver.findElements(By.xpath("//div[@class='name']"));
		Set<String> bagSet = new LinkedHashSet<String>();
		for (WebElement webEle : bagName) {
			String name1 = webEle.getText();
			bagSet.add(name1);
		}
		
		for (String str : bagSet) {
			System.out.print(str+" "+",");
		}
		Thread.sleep(1000);
		driver.close();
		
	}
}
	


