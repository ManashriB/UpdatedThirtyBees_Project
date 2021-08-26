package thirtybees.Test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import thirtybees.base.TestBase;
import thirtybees.listener.ListnerTest;
import thirtybees.pages.FooterPage;



@Listeners(ListnerTest.class)
public class footerTest extends TestBase {
	
	
		public FooterPage fp;
		WebDriver driver;

		@BeforeMethod
	public void setUp(){
		
		driver= intialization(); //intialize the browser
		 readProperty("url");
		 fp= new FooterPage(driver);
	}		
		
	
	@Test(priority=1)
	public void verifyFooterPageHeader(){
		test=extent.createTest("verifyFooterPageHeader");
		try {
			Assert.assertTrue(fp.footerPageHeader());
		   }   catch (Exception e) {
		  e.printStackTrace();
		 }
	}
@Test(priority=2)
public void verifySequanceOfinformationCols(){
	test=extent.createTest("verifySequanceOfinformationCols");
	Assert.assertTrue(fp.checkSequanceOfinformationCols());
	
}	
	
@Test(priority=3)
public void verifySequanceOfMyAccountCols(){
	test=extent.createTest("verifySequanceOfMyAccountCols");
	Assert.assertTrue(fp.checkSequanceOfMyAccountCols());
}

@Test(priority=4)
public void verifySequanceStoreInformationCols(){
	test=extent.createTest("verifySequanceStoreInformationCols");
	Assert.assertTrue(fp.checkSequanceOf_StoreInformationCols());
}
@Test(priority=5)	
public void verifyMouseHoverFunctionalityOn_InfoCols(){
	test=extent.createTest("verifyMouseHoverFunctionalityOn_InfoCols");
	Assert.assertEquals(fp.checkMouseHoverFunctionalityOn_InfoCols(), true);
}

@Test(priority=6)	
public void verifyMouseHoverFunctionalityOn_MyAccountCols(){
	test=extent.createTest("verifyMouseHoverFunctionalityOn_MyAccountCols");
Assert.assertEquals(fp.checkMouseHoverFunctionalityOn_MyAccountCols(), true);
}	
 @Test(priority=7)
 public void verifyMouseHoverFunctionalityOn_StoreInfoCols(){
	 test=extent.createTest("verifyMouseHoverFunctionalityOn_StoreInfoCols");
	Assert.assertEquals(fp.checkMouseHoverFunctionalityOn_StoreInfoCols(), true); 
}
@Test(priority=8)
public void checkClickOnElement_Special() {
	test=extent.createTest("checkClickOnElement_Special");
	Assert.assertTrue(fp.clickOnElement_Special());
} 
@Test(priority=9)
public void verifyClickOnElement_newProducts(){
	test=extent.createTest("verifyClickOnElement_newProducts");
	Assert.assertTrue(fp.clickOnElement_newProducts());
	
}
@Test(priority=10)
public void verifyClickOnElement_topSellers(){
	test=extent.createTest("verifyClickOnElement_topSellers");
	Assert.assertTrue(fp.clickOnElement_topSellers());
}
@Test(priority=11)
public void verifyClickOnElement_ourStore(){
	test=extent.createTest("verifyClickOnElement_ourStore");
	Assert.assertTrue(fp.clickOnElement_ourStore());
	
}
@Test(priority=12)
public void verifyClickOnElement_Sitemap(){
	test=extent.createTest("verifyClickOnElement_Sitemap");
  Assert.assertTrue(fp.clickOnElement_Sitemap());
}

@Test(priority=13)
public void verifyClickOnElement_myAccount(){
	test=extent.createTest("verifyClickOnElement_myAccount");
  Assert.assertTrue(fp.clickOnElement_myAccount());

}
@Test(priority=14)
public void verifyClickOnElement_myCreditSleep(){
	test=extent.createTest("verifyClickOnElement_myCreditSleep");
  Assert.assertTrue(fp.clickOnElement_myCreditSleep());

}
@Test(priority=15)
public void verifyClickOnElement_myAddress(){
	test=extent.createTest("verifyClickOnElement_myAddress");
  Assert.assertTrue(fp.clickOnElement_myAddress());

}

@Test(priority=16)
public void verifyFacebook_loginToFB(){
	test=extent.createTest("verifyFacebook_loginToFB");
	Assert.assertTrue(fp.moveOnFacebook_loginToFB());
	
}

@Test(priority=17)
public void verifyTwitterElement() throws Exception{
	test=extent.createTest("verifyTwitterElement");
	Assert.assertTrue(fp.moveToTheTwitter());
	
   }
@Test(priority=18)
public void checkAlreadyRegister_newsletter(){
	test=extent.createTest("checkAlreadyRegister_newsletter");
	Assert.assertTrue(fp.alreadyRegister_newsletter());
	
}
@Test(priority=19)
public void checkNewRegistration_newsletter(){
	test=extent.createTest("checkNewRegistration_newsletter");
	Assert.assertTrue(fp.newRegistration_newsletter());

   }
}