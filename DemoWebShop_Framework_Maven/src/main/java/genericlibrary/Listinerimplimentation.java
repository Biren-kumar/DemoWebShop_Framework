package genericlibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listinerimplimentation implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("------------------------ Exuecution of|| "+result.getName()+" || Started--------------------------");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("------------------------ Exuecution of|| "+result.getName()+" || Success--------------------------");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("------------------------ Exuecution of|| "+result.getName()+" || Failed--------------------------");
		TakesScreenshot ts = (TakesScreenshot)BaseTest.listenersDriver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("./ErrorShots/"+result.getName()+".png");
		try {
			FileHandler.copy(src, trg);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
