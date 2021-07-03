package Test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class test2 {

	WebDriver driver = new ChromeDriver();

	@Test
	public void testCase1() throws InterruptedException {
		initTest();
		driver.findElement(By.xpath("//inpiut[@name='q']")).sendKeys("Arigato");
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void testCase2() throws InterruptedException {
        initTest();  
		driver.findElement(By.xpath("//inpiut[@name='q']")).sendKeys("Ni Hao");
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void testCase3() throws InterruptedException {
		driver.findElement(By.xpath("//inpiut[@name='q']")).sendKeys("Kalimera");
		Thread.sleep(2000);
		driver.close();
	}
	
	@Before
	public void initTest()
	{
		driver.get("https://www.google.com");
		driver.manage().window().fullscreen();
	}

}