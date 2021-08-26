package com.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectUtils {

	//WebDriver driver;
		public void selectByText(WebElement element,String text){
			Select sel=new Select(element);
			sel.selectByVisibleText(text);
			
		}
		public void selectByIndex(WebElement element,int index){
			Select sel1=new Select(element);
			sel1.selectByIndex(index);
		}

		public void selectByValue(WebElement element,String value){
			Select sel2=new Select(element);
			sel2.selectByValue(value);
		}

	}	
	
	
	

