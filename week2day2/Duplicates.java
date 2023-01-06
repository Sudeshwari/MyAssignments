package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Duplicates {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(30);
		driver.findElement(By.xpath("((//a[@class='x-tab-right'])//span)[6]")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("sudeshwari@gmail.com");
		driver.findElement(By.xpath("(//td[@class='x-btn-center'])[7]")).click();// td[@class='x-btn-center'])[7]
		Thread.sleep(90);
		String text = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a"))
				.getText();// div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a
		System.out.println(text);
		Thread.sleep(60);
		String text1 = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])/a"))
				.getText();
		System.out.println(text1);

		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a")).click();
		Thread.sleep(60);

		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[1]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.className("smallSubmit")).click();
		String text2 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(text2);
		if (text1.equals(text2)) {
			System.out.println("sucessfully duplicate  lead is created");
		} else {
			System.out.println("failed to create lead");
		}

	}

}
