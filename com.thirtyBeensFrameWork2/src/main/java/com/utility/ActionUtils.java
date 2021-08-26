package com.utility;

import org.openqa.selenium.WebElement;

public class ActionUtils {
	public void sendKeys(WebElement element, String dataToEnter) {
		element.sendKeys(dataToEnter);
	}
	
	public String getTextMsg(WebElement ele){
		String msg=ele.getText();
		return msg;
	}
}

