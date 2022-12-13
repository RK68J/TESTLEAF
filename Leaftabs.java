package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Leaftabs {


	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();

		driver.findElement(By.className("inputLogin")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println(driver.getTitle());		

		if (driver.getTitle().contentEquals("opentaps CRM")) {
			driver.findElement(By.name("USERNAME")).sendKeys("democsr");
			driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
			driver.findElement(By.className("loginButton")).click();		

		}else {
			 

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		WebElement ddSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd1 = new Select(ddSource);
		dd1.selectByVisibleText("Conference");

		WebElement ddIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd2 = new Select(ddIndustry);
		dd2.selectByValue("IND_FINANCE");

		WebElement ddOwnership = driver.findElement(By.name("ownershipEnumId"));
		Select dd3 = new Select(ddOwnership);
		dd3.selectByIndex(5);


			}
		}

}
