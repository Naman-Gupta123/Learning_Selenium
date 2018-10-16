package test;

import org.openqa.selenium.Dimension;

import java.util.List;

//import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleCode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver c = new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://www.proposalways.com/userLogin");
		c.findElement(By.id("user_email")).sendKeys("naman.gupta@webners.com");
		c.findElement(By.id("user_password")).sendKeys("abc123");
		c.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		c.findElement(By.id("arrowsidenavbar")).click();
		
		Actions d = new Actions(c);
		d.moveToElement(c.findElement(By.linkText("Templates"))).build().perform();
		Thread.sleep(2000);
		c.findElement(By.linkText("View")).click();
		
		Thread.sleep(2000);
		
		List <WebElement> tabs=c.findElements(By.xpath("//ul[contains(@class,'nav-justified')]//li"));
		for(int i=0;i<tabs.size();i++)
		{
			Thread.sleep(2000);
			System.out.println(tabs.get(i).getText());
		}
	}
}
		

