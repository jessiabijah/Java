package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLanuch {
	public static void main(String[] args) {
		
		//browser----chrome----; key-----browser key, value---location of driver e
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Seleniumprogram\\Driver\\chromedriver.exe");
		//instanciation
	WebDriver driver =	new ChromeDriver();
	//to lanch url 
	driver.get(" http://www.greenstechnologys.com/");
	//to close a browser
	driver.close();
	}

}
