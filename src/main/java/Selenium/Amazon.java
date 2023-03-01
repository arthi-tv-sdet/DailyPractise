package Selenium;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	@Test(invocationCount = 5)
	public void AmazonOrderList(ITestContext testContext)  {
		
		 int currentCount = testContext.getAllTestMethods()[0].getCurrentInvocationCount();
	      System.out.println("Executing count: " + currentCount);
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver= new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[text()='Account & Lists']")).click();
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("8870252813");
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Amaze@2023");
		
		driver.findElement(By.id("signInSubmit")).click();
		
		driver.findElement(By.xpath("(//span[text()='All'])[2]")).click();
		
		driver.findElement(By.linkText("Your Account")).click();
		
		driver.findElement(By.xpath("(//div[@class='ya-card-cell'])[1]")).click();
		
		WebElement orderDrop=driver.findElement(By.xpath("//select[@id='time-filter']"));
		
		Select op=new Select(orderDrop);
		
		op.selectByValue("year-2022");
		
		System.out.println("Orders placed in 2022 : " + driver.findElement(By.xpath("//span[@class='num-orders']")).getText());
		
		List<WebElement> productNames = driver.findElements(By.xpath("//div[@class='a-row']//a[@class='a-link-normal']"));
		
		for (Iterator iterator = productNames.iterator(); iterator.hasNext();) {
			WebElement webElement = (WebElement) iterator.next();
			System.out.println(webElement.getText());
		}
		//ITestContext testContext=testContext.getAllTestMethods()[0].getCurrentInvocationCount();
		driver.close();
		
	}
}
