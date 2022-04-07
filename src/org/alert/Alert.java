package org.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PratheeshRK\\eclipse-workspace\\Alert\\Chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
	org.openqa.selenium.Alert a = driver.switchTo().alert();
	String text = a.getText();
	System.out.println(text);
	Thread.sleep(2000);
	a.accept();
	driver.findElement(By.xpath("//a[@href=\'#CancelTab\']")).click();
	driver.findElement(By.xpath("//button[@onclick=\'confirmbox()\']")).click();
	org.openqa.selenium.Alert a2 = driver.switchTo().alert();
	String text2 = a2.getText();
	System.out.println(text2);
	Thread.sleep(3000);
	a2.dismiss();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
	driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();
	Thread.sleep(2000);
	org.openqa.selenium.Alert a3 = driver.switchTo().alert();
	String text3 = a3.getText();
	System.out.println(text3);
	Thread.sleep(2000);
	a3.sendKeys("welcome");
	Thread.sleep(2000);
	a3.dismiss();

	
	
	
	
}
}
