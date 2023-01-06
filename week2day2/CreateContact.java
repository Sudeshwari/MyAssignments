package week2day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Create Contact")).click();
		//driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("sudeshwari");
		driver.findElement(By.id("lastNameField")).sendKeys("c");
		driver.findElement(By.name("firstNameLocal")).sendKeys("sudesh");
		driver.findElement(By.name("lastNameLocal")).sendKeys("cccccc");
		driver.findElement(By.name("departmentName")).sendKeys("testleaf accounts");
		driver.findElement(By.name("description")).sendKeys("hello all");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("sudeshwari@gmail.com");
		//select state or province as visible test
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("hello all");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
	
		
		
		
		
		
		
		
		
		
		
	
		
		

	}

}
