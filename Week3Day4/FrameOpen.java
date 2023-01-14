package Week3Day4;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameOpen {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver=new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
         driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
         driver.manage().window().maximize();
       
        
          driver.switchTo().frame("iframeResult");
          driver.findElement(By.xpath("//button[text()='Try it']")).click();
          //driver.switchTo().defaultContent();
          Alert alert = driver.switchTo().alert();
          alert.accept();
       
           String text = driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
           System.out.println(text);
           if (text.contains("You pressed OK!")) {
        	   System.out.println("alert accepted");
			
		}
           else {
        	   System.out.println("alert declined");
           }
       
        
	}

}
