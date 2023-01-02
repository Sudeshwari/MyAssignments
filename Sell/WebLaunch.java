package Sell;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebLaunch {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.id("Login")).click();
		String Title=driver.getTitle();
		System.out.println(Title);
		
		
		// TODO Auto-generated method stub

	}

}
