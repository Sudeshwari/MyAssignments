package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class AssignElement1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.name("firstname")).sendKeys("sudeshwari");
		driver.findElement(By.name("lastname")).sendKeys("c");
		driver.findElement(By.name("reg_email__")).sendKeys("sudeshwari@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("cdfsdfdsf");
		WebElement optionDate=driver.findElement(By.name("birthday_day"));
		Select sc1=new Select(optionDate);
		sc1.selectByValue("22");
		
		WebElement optionMonth=driver.findElement(By.name("birthday_month"));
		Select sc2=new Select(optionMonth);
		sc2.selectByValue("10");
		
		WebElement optionYear=driver.findElement(By.name("birthday_year"));
		Select sc3=new Select(optionYear);
		sc3.selectByValue("1994");
		driver.findElement(By.className("_8esa")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
