package register;

import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class RegisterTestCas extends genericlibrary.BaseTest {
	@Test(groups = "functional" , dataProvider =  "registerdata")
	public void verify_user_is_ableto_register(String Fname,String Lname,String email,String password,String confpassword) throws EncryptedDocumentException, IOException {
		hp.getLogoutLink().click();
		hp.getRegisterLink().click();

		//verification
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Register");
		Reporter.log("Register page Displayed");

		String modemail= new Random().nextInt(2000)+email;
		pomRepository.RegisterPage rg= new pomRepository.RegisterPage(driver);
		rg.getMaleRadioButton().click();
		rg.getFirstnameTextfield().sendKeys(Fname);
		rg.getLastNameTextfield().sendKeys(Lname);
		rg.getEmailTextfield().sendKeys(modemail);
		rg.getPasswordTextField().sendKeys(password);
		rg.getConfirmPasswordTextField().sendKeys(confpassword);
		rg.getRegisterButton().click();

		//verification
		boolean res=rg.getSuccessMsg().isDisplayed();
		Assert.assertEquals(res, true);
		org.testng.Reporter.log("test case passed");
	}
	@DataProvider(name = "registerdata")
	public Object[][] datasupply() throws EncryptedDocumentException, IOException{
		return dt.getmultipleDataFromExcel("RegisterData");
	}
}
