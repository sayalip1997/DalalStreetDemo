package com.ds.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.ds.testBase.TestBase;

public class UtilClass extends TestBase {
	
	public UtilClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	//screenshot
	public static void takeScreenShot(String filename) 
	{
		try 
		{
			String path = "C:\\Users\\232338\\eclipse-workspace\\30JulyMBDalalStrreet\\screenshot\\";
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			File des = new File(path+filename+".png");
			FileHandler.copy(src, des);
		} 
		catch (IOException e) 
		{
			System.out.println("IO Exception - file not found");
			e.printStackTrace();
		}
		
	}

}
