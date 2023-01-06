package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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

		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("0123456789");// input[@name='phoneNumber']

		driver.findElement(By.xpath("(//td[@class='x-btn-center'])[7]")).click();// td[@class='x-btn-center'])[7]
		Thread.sleep(90);

		String text = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a"))
				.getText();// div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a
		System.out.println(text);
		Thread.sleep(60);

		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a")).click();

		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();

		Thread.sleep(30);
		driver.findElement(By.linkText("Find Leads")).click();

		Thread.sleep(30);
		driver.findElement(By.xpath("(//div[@class='x-form-element']/input)[13]")).sendKeys(text);
		driver.findElement(By.xpath("(//td[@class='x-panel-btn-td'])[6]")).click();
		Thread.sleep(90);
		String text3 = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println(text3);

		driver.close();

	}

}
