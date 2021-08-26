package com.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import thirtybees.base.TestBase;

public class JavaScriptEx_Utils extends TestBase{
	
	public static void scrollUpToVisibility(WebElement element){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		
	}
}

