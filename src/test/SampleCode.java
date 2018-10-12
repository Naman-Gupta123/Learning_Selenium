package test;

//import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleCode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver c = new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://www.proposalways.com/userLogin");
		
		c.findElement(By.id("user_email")).sendKeys("naman.gupta@webners.com");
		c.findElement(By.id("user_email")).sendKeys(Keys.CONTROL+"ac");
		c.findElement(By.id("user_email")).clear();
		c.findElement(By.id("user_password")).sendKeys(Keys.CONTROL+"av");
		c.findElement(By.id("loginButton")).submit();

	}
}
		
		

