package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class LaunchBrowser {


	public static void main(String[] args) {
		//		ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();

		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		/*
		Options manage = driver.manage();
		Window window = manage.window();
		window.maximize();
		 */
   

		driver.findElement(By.className("inputLogin")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String URL1 = driver.getTitle();

		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.id("Login")).click();
		String URL2 = driver.getTitle();	
		driver.quit();

		System.out.println(URL1);
		System.out.println(URL2);
	}
}
