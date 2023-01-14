package Week3Day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.xpath("//a[contains(text(),'URBAN FIT X SMART WATCH')]")).click();
		
		 driver.switchTo().frame(1);
		 driver.findElement(By.xpath("(//button[@class='InitialMessageBubble__CloseButton-sc-1sz7s3c-2 fVrRGD'])/div")).click();
		 driver.switchTo().defaultContent();
		driver.findElement(By.id("wk_zipcode")).sendKeys("560033");
		Thread.sleep(2000);
		 driver.findElement(By.xpath("(//div[@class='wk_zipfinder_btn'])/input")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//button[@id='product-add-to-cart'])")).click();
		 Thread.sleep(2000);
		WebElement findElement= driver.findElement(By.xpath("(//span[text()='View Cart'])"));
		 driver.executeScript("arguments[0].click();",findElement );
		 driver.findElement(By.id("checkout")).click();
		 Thread.sleep(2000);
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
		 driver.findElement(By.id("agree")).click();
		 driver.findElement(By.id("checkout")).click();
		 }
}
