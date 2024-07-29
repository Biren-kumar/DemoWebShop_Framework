package genericlibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pomRepository.HomePage;
import pomRepository.LoginPage;

public class BaseTest {
	public DataUtility dt=new DataUtility();
	public WebDriver driver;
	public static WebDriver listenersDriver;
	public HomePage hp;

	@BeforeClass(alwaysRun = true)
	public void lunchTheBrowser() throws IOException {
		driver =new ChromeDriver();
		listenersDriver =driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(dt.getDataFromProperties("Url"));
	}
	@BeforeMethod(alwaysRun = true)
	public void preformLogin() throws IOException {
		hp = new HomePage(driver);
		hp.getLoginLink().click();
		LoginPage lp = new LoginPage(driver);
		lp.getEmailTextField().sendKeys(dt.getDataFromProperties("Email"));
		lp.getPasswordTextField().sendKeys(dt.getDataFromProperties("pwd"));
		lp.getLoginButton().click();

	}
	@AfterMethod(alwaysRun = true)
	public void performLogout() {
		hp.getLogoutLink().click();
	}
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
	}
}
