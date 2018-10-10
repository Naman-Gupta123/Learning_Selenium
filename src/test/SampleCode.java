package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver c = new ChromeDriver();
		c.get("https://widget-test-site.s3.amazonaws.com/THEMES_TEST/tac_button_theme_test.html");
		c.manage().window().maximize();
		
c.findElement(By.xpath("//img[@src='//dev.turnacar-content.redlineinventory.com/player_themes/lib/lexus-00/open_turnacar.png']")).getCssValue("hello");
	}

}
