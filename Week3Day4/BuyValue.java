package Week3Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BuyValue {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		ChromeOptions option = options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//a[contains(text(),'URBAN FIT X SMART WATCH')]")).click();
		 Thread.sleep(2000);
		
		 driver.findElement(By.xpath("(//input[@id='wk_inavail_msg'])/preceding-sibling::input")).sendKeys("560033");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//div[@class='wk_zipfinder_btn'])/input")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//button[@id='product-add-to-cart'])")).click();
		 Thread.sleep(2000);
		 driver.switchTo().frame(1);
		 driver.findElement(By.xpath("(//button[@class='InitialMessageBubble__CloseButton-sc-1sz7s3c-2 fVrRGD'])/div")).click();
		 driver.switchTo().defaultContent();
		  
		   WebElement parent = driver.findElement(By.xpath("//iframe[@id='hubspot-conversations-iframe']"));
		   driver.switchTo().frame(parent);
		  
		 //  driver.switchTo().frame(2);
		
		   driver.switchTo().defaultContent();
		 driver.findElement(By.xpath("(//div[@class='actions'])/div")).click();
		 
		 }

	
	
}
