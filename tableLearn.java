package Week4Day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableLearn {

	public static void main(String[] args) {
		 
			ChromeDriver driver=new ChromeDriver();

			driver.get("https://erail.in/trains-between-stations/new-delhi-NDLS/bangalore-cant-BNC");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			List<WebElement> Rows = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader'] //tr//td[2]"));
			System.out.println(Rows.size());
			for (WebElement each : Rows) {
				String text = each.getText();
				System.out.println(text);
				
			}
			
	}

}
