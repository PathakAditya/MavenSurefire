package Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class test1 {
	
	WebDriver driver = new ChromeDriver();
	
	@Test
	public void testCase1() throws InterruptedException {
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//inpiut[@name='q']")).sendKeys("Hello");
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test
	public void testCase2() throws InterruptedException {
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//inpiut[@name='q']")).sendKeys("Namaste");
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test
	public void testCase3() throws InterruptedException {
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//inpiut[@name='q']")).sendKeys("Bonjour");
		Thread.sleep(2000);
		driver.close();
	}

}
