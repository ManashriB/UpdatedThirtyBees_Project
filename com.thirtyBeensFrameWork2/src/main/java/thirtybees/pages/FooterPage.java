package thirtybees.pages;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import thirtybees.objectRepository.FooterPageObjectRepository;

public class FooterPage extends FooterPageObjectRepository {

	WebDriver driver;
	Action act;
	Actions acts;

	public FooterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public boolean footerPageHeader() {
		ArrayList<String> expList = new ArrayList<String>();
		DataFormatter df = new DataFormatter();
		FileInputStream fis;
		Workbook wb = null;

		try {
			fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/" + "/Thirtybees.xlsx");
			wb = WorkbookFactory.create(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Sheet sh = wb.getSheet("footer");
		int colnum = sh.getRow(0).getLastCellNum();
		for (int i = 0; i <= 2; i++) {
			Cell cell = sh.getRow(0).getCell(i);
			String celldata = df.formatCellValue(cell);
			expList.add(celldata);
		}

		ArrayList<String> actList = new ArrayList<String>();
		actList.add("INFORMATION");
		actList.add("MY ACCOUNT");
		actList.add("STORE INFORMATION");

		footerLogs().info(expList + " " + actList);

		if (expList.equals(actList)) {
			footerLogs().info("The header list and Sequance are correct");
			return true;
		} else {
			footerLogs().info("The header list and Sequance are incorrect");
			return false;
		}

	}

	public boolean checkSequanceOfinformationCols() {

		ArrayList<String> expList = new ArrayList<String>();
		DataFormatter df = new DataFormatter();
		FileInputStream fis;
		Workbook wb = null;

		try {
			fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/" + "/Thirtybees.xlsx");
			wb = WorkbookFactory.create(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Sheet sh = wb.getSheet("footer");
		int rowNum = sh.getLastRowNum();
		for (int i = 1; i <= rowNum; i++) {
			Row row = sh.getRow(i);
			Cell cell = row.getCell(0);
			String celldata = df.formatCellValue(cell);

			expList.add(celldata);
		}

		ArrayList<String> actList = new ArrayList<String>();
		List<WebElement> listOfInformationblock = informationCols;

		for (WebElement list : listOfInformationblock) {
			String value = list.getText();
			actList.add(value);
		}
		footerLogs().info(expList + " " + actList);
		if (expList.equals(actList)) {
			footerLogs().info("the list and sequance of information Cols are correct");
			return true;
		} else {
			footerLogs().info("the list and sequance of information Cols are mismatch");
			return false;
		}
	}

	public boolean checkSequanceOfMyAccountCols() {

		ArrayList<String> expList = new ArrayList<String>();
		DataFormatter df = new DataFormatter();
		FileInputStream fis;
		Workbook wb = null;

		try {
			fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/" + "/Thirtybees.xlsx");
			wb = WorkbookFactory.create(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Sheet sh = wb.getSheet("footer");
		int rowNum = sh.getLastRowNum();
		for (int i = 1; i <= 5; i++) {
			Row row = sh.getRow(i);
			Cell cell = row.getCell(1);
			String celldata = df.formatCellValue(cell);

			expList.add(celldata);
		}

		ArrayList<String> actList = new ArrayList<String>();
		List<WebElement> listOfInformationblock = myAccountCols;

		for (WebElement list : listOfInformationblock) {
			String value = list.getText();
			actList.add(value);
		}
		footerLogs().info(expList + " " + actList);
		if (expList.equals(actList)) {
			footerLogs().info("the list and sequance of information Cols are correct");
			return true;
		} else {
			footerLogs().info("the list and sequance of information Cols are mismatch");
			return false;
		}
	}

	public boolean checkSequanceOf_StoreInformationCols() {

		ArrayList<String> expList = new ArrayList<String>();
		DataFormatter df = new DataFormatter();
		FileInputStream fis;
		Workbook wb = null;

		try {
			fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/" + "/Thirtybees.xlsx");
			wb = WorkbookFactory.create(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Sheet sh = wb.getSheet("footer");
		int rowNum = sh.getLastRowNum();
		for (int i = 1; i <= 4; i++) {
			Row row = sh.getRow(i);
			Cell cell = row.getCell(2);
			String celldata = df.formatCellValue(cell);

			expList.add(celldata);
		}

		ArrayList<String> actList = new ArrayList<String>();
		List<WebElement> listOfInformationblock = storeInformationCols;
		for (WebElement list : listOfInformationblock) {
			String value = list.getText();
			actList.add(value);
		}
		footerLogs().info(expList + " " + actList);
		if (expList.equals(actList)) {
			footerLogs().info("the list and sequance of store information Cols are correct");
			return true;
		} else {
			footerLogs().info("the list and sequance of store information Cols are incorrect");
			return false;
		}
	}

	public boolean checkMouseHoverFunctionalityOn_InfoCols() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true);", specialElement);
		List<WebElement> list = informationCols;
		Actions action = new Actions(driver);
		for (WebElement value : list) {
			action.moveToElement(value).pause(2000).build().perform();

		}
		return true;

	}

	public boolean checkMouseHoverFunctionalityOn_MyAccountCols() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true);", myAccount);
		List<WebElement> list = myAccountCols;
		Actions action = new Actions(driver);
		for (WebElement value : list) {
			action.moveToElement(value).pause(2000).build().perform();

		}
		return true;
	}

	public boolean checkMouseHoverFunctionalityOn_StoreInfoCols() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true);", specialElement);
		List<WebElement> list = storeInformationCols;
		Actions action = new Actions(driver);
		for (WebElement value : list) {
			action.moveToElement(value).pause(2000).build().perform();

		}
		return true;
	}

	public boolean clickOnElement_Special() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true);", specialElement);
		specialElement.click();
		String actTitle = driver.getTitle();
		String expTitle = "Prices drop - BEE";
		footerLogs().info(expTitle + " " + actTitle);
		if (expTitle.equals(actTitle)) {
			footerLogs().info("The title are correct");
			return true;
		} else {
			footerLogs().info("The title are mismatch");
			return false;
		}

	}

	public boolean clickOnElement_newProducts() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true);", newProducts);
		newProducts.click();
		String actTitle = driver.getTitle();
		String expTitle = "New products - BEE";
		footerLogs().info(expTitle + " " + actTitle);
		if (expTitle.equals(actTitle)) {
			footerLogs().info("The title are correct");
			return true;
		} else {
			footerLogs().info("The title are mismatch");
			return false;
		}

	}

	public boolean clickOnElement_topSellers() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true);", topSellersElement);
		topSellersElement.click();
		String actTitle = driver.getTitle();
		String expTitle = "Best sales - BEE";
		footerLogs().info(expTitle + " " + actTitle);
		if (expTitle.equals(actTitle)) {
			footerLogs().info("The title are correct");
			return true;
		} else {
			footerLogs().info("The title are mismatch");
			return false;
		}

	}

	public boolean clickOnElement_ourStore() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true);", ourStoreElement);
		ourStoreElement.click();
		String actTitle = driver.getTitle();
		String expTitle = "Stores - BEE";
		footerLogs().info(expTitle + " " + actTitle);
		if (expTitle.equals(actTitle)) {
			footerLogs().info("The title are correct");
			return true;
		} else {
			footerLogs().info("The title are mismatch");
			return false;
		}

	}

	public boolean clickOnElement_Sitemap() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true);", SitemapElement);
		SitemapElement.click();
		String actTitle = driver.getTitle();
		String expTitle = "Sitemap - BEE";
		footerLogs().info(expTitle + " " + actTitle);
		if (expTitle.equals(actTitle)) {
			footerLogs().info("The title are correct");
			return true;
		} else {
			footerLogs().info("The title are mismatch");
			return false;
		}

	}

	public boolean clickOnElement_myAccount() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true);", myAccount);
		myAccount.click();
		String actTitle = driver.getTitle();
		String expTitle = "Login - BEE";
		footerLogs().info(expTitle + " " + actTitle);
		if (expTitle.equals(actTitle)) {
			footerLogs().info("The title are correct");
			return true;
		} else {
			footerLogs().info("The title are mismatch");
			return false;
		}

	}

	public boolean clickOnElement_myCreditSleep() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true);", myCreditSleep);
		myCreditSleep.click();
		String actTitle = driver.getTitle();
		String expTitle = "Login - BEE";
		footerLogs().info(expTitle + " " + actTitle);
		if (expTitle.equals(actTitle)) {
			footerLogs().info("The title are correct");
			return true;
		} else {
			footerLogs().info("The title are mismatch");
			return false;
		}

	}

	public boolean clickOnElement_signOut() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Thread.sleep(5000);
		js.executeScript("arguments[0].scrollIntoView(true);", logOut);
		logOut.click();
		String actTitle = driver.getTitle();
		String expTitle = "Sign out - BEE";
		footerLogs().info(expTitle + " " + actTitle);
		if (expTitle.equals(actTitle)) {
			footerLogs().info("The title are correct");
			return true;
		} else {
			footerLogs().info("The title are mismatch");
			return false;
		}

	}

	public boolean clickOnElement_myAddress() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true);", myAddress);
		myAddress.click();
		String actTitle = driver.getTitle();
		String expTitle = "Login - BEE";
		footerLogs().info(expTitle + " " + actTitle);
		if (expTitle.equals(actTitle)) {
			footerLogs().info("The title are correct");
			return true;
		} else {
			footerLogs().info("The title are mismatch");
			return false;
		}
	}

	public boolean moveOnFacebook_loginToFB() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		js.executeScript("arguments[0].scrollIntoView(true);", facebook);
		facebook.click();
		String actTitle = driver.getTitle();
		String mainwindow = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		// Using Iterator to iterate with in windows
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String childWindow = itr.next();
			// Compare whether the main windows is not equal to child window. If
			// not equal, we will switch.
			if (!mainwindow.equals(childWindow)) {

				driver.switchTo().window(childWindow);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				email.sendKeys("manu@gmail.com");
				password.sendKeys("123456");
				Login.click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				driver.switchTo().window(mainwindow);

			} // while loop close

		} // if loop close
		String expTitle = "Facebook BEE";
		footerLogs().info(expTitle + " " + actTitle);
		if (expTitle.equals(actTitle)) {
			footerLogs().info("The title are correct");
			return true;
		} else {
			footerLogs().info("The title are mismatch");
			return false;
		}

	}

	public boolean moveToTheTwitter() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true);", TwitterEle);
		TwitterEle.click();
		String actTitle = driver.getTitle();
		String expTitle = "BEE";
		driver.navigate().back();
		footerLogs().info(actTitle + " " + expTitle);
		if (expTitle.equals(actTitle)) {
			footerLogs().info("The title are correct");
			return true;
		} else {
			footerLogs().info("The title are mismatch");
			return false;
		}

	}

	@Test
	public boolean alreadyRegister_newsletter() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", newsletterInput);

		newsletterInput.sendKeys("bhagyashri@gmail.com");
		clickOn_signUp.click();
		WebElement value = alertFor_alreadyRegister;
		String actText = value.getText();
		String expText = "This email address is already registered.";
		footerLogs().info(expText + " " + actText);
		return true;

	}

	public boolean newRegistration_newsletter() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", newsletterInput);
		// before run this method send new mail id here.
		newsletterInput.sendKeys("guru99@gmail.com");
		clickOn_signUp.click();
		WebElement value = alertFor_newRegister;
		String actText = value.getText();
		String expText = "You have successfully subscribed to this newsletter.";
		footerLogs().info(expText + " " + actText);
		return true;
	}

}
