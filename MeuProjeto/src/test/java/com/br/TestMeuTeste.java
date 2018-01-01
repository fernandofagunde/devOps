package com.br;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestMeuTeste {
	
	protected WebDriver driver;
	public String url = "http://www.google.com.br";
	@Test
	public void browserIE() {
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\fernando.f.andrade\\Documents\\Projetos\\camealao\\chromedriver_win32\\chromedriver.exe");
		
		driver = new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	}

}
