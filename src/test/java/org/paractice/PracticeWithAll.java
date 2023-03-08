package org.paractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeWithAll {
	
	@Test
	public void method() {
        
		System.out.println("Hi Started From Begning");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//String uralMethod = getUralMethod(driver);
		System.out.println(getUralMethod(driver));
		driver.quit();
		
		

	}
	
	public String getUralMethod(WebDriver driver) {
		
		 return  driver.getCurrentUrl();
		
		//return url;

	}
	
	
//	public static void main(String[] args) {
//		int num = 11;
//		System.out.println(num);
//		
//		//JavaPractice pt = new JavaPractice();
//		//PracticeWithAll pt = new PracticeWithAll();
//		//pt.newModel();
//		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.1.1");
//	}

}
