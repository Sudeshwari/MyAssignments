package Sell;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;


public class FristSeli {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String Result=driver.getTitle();
		System.out.println(Result);
		
		
 

	}

}
