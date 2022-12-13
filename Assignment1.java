package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new  ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Create")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.name("firstname")).sendKeys("Queen");
		driver.findElement(By.name("lastname")).sendKeys("King");
		driver.findElement(By.name("reg_email__")).sendKeys("66644333");
		driver.findElement(By.name("reg_passwd__")).sendKeys("xxxyyyzzzz");
		Select ddDay = new Select(driver.findElement(By.id("day")));
		ddDay.selectByVisibleText("6");
		Select ddMonth = new Select(driver.findElement(By.id("month")));
		ddMonth.selectByIndex(8);
		Select ddYear = new Select(driver.findElement(By.id("year")));
		ddYear.selectByVisibleText("1995");
		driver.findElement(By.name("sex")).click();


	}

}
