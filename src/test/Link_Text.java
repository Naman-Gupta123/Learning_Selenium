package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver c=new ChromeDriver();
		c.get("https://naman1.lmscheckouttest.com/Course/index");
		c.findElement(By.partialLinkText(" ACCOUNT")).click();
		System.out.println(c.getTitle());
	}

}
