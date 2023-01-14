package Week3Day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {

	public static void main(String[] args) {
	 
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://www.leafground.com/alert.xhtml");
         driver.manage().window().maximize();
        driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
         Alert alert = driver.switchTo().alert();
        String text = alert.getText(); 
         alert.dismiss();
          String text2 = driver.findElement(By.id("result")).getText();
          System.out.println(text2);
          if (text2.contains("cancel")) {
        	   System.out.println("alert accepted");
			
		}
          else
          {
        	  System.out.println("alert delined");
          }
         driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
      alert.sendKeys("sudeshwari");
      alert.accept();
      driver.findElement(By.id("confirm_result")).getText();
	
		
	}

}
