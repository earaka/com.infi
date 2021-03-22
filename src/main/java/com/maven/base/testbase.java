package com.maven.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Utillib;

public class testbase {
	
	public static WebDriver driver;
	
	File f;
	
	FileInputStream fis;
	
	Properties pro;
	
	public testbase()
	{
		try
		{
			
		f=new File(".\\src\\main\\java\\config\\config.properties");
		
		fis=new FileInputStream(f);
		
		pro=new Properties();
		
		pro.load(fis);
		
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void openBrowser()
	{
		String browser=pro.getProperty("browsername");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			
			driver=new FirefoxDriver();
			
		}
		
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			
			driver=new EdgeDriver();
		}
		
		else
		{
			System.out.println("Given browser name is wrong");
		}
		
		driver.get(pro.getProperty("url"));
		
		Utillib.max_window();
		
		Utillib.implicit_wait(30);
		
		
	}
	
}
