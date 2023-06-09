package OpenHRMModule3AdminTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import OpenHRMModule1LoginPage.OpenHRMModule1LoginPage;
import OpenHRMModule2HomePage.OpenHRMModule2HomePage;
import OpenHRMModule3AdminPage.OpenHRMModule3AdminPage;
import OpenHRMModule3AdminPage.OpenHRMModule3Admin_Add_UserPage;

public class AddUserTest2 extends BaseClass
{
	int TestCaseID;
	OpenHRMModule1LoginPage login;
	OpenHRMModule2HomePage home;
	OpenHRMModule3AdminPage admin;
	OpenHRMModule3Admin_Add_UserPage addUser;
	SoftAssert soft;
	
	@BeforeClass
	public void openBroswer() throws IOException
	{
		
		openBrowser();
		login = new OpenHRMModule1LoginPage(driver);
		home = new OpenHRMModule2HomePage(driver);
		admin = new OpenHRMModule3AdminPage(driver);
		addUser= new OpenHRMModule3Admin_Add_UserPage(driver);
		soft= new SoftAssert();
		
	}
	
	@BeforeMethod
	public void loginIntoApp() throws IOException
	{
		login.inpOpenHRMModule1LoginPageUsername(UtilityClass.getPropertyFileData("username"));
		login.inpOpenHRMModule1LoginPagePassword(UtilityClass.getPropertyFileData("password"));
		login.clikOpenHRMModule1LoginPageLoginButton();
	}
	@Test
	public void verificationofloginmodule() throws InterruptedException, IOException
	{
		TestCaseID=6;
		Thread.sleep(2000);
		soft.assertTrue(home.verifyOpenHRMModule2HomePageOrangeHRMBanner());
		soft.assertEquals(UtilityClass.getExcelData(1, 1), home.verifyOpenHRMModule2HomePageDashboardTitle());
		soft.assertEquals(UtilityClass.getExcelData(2, 1), home.clickOpenHRMModule2HomePageAdminButton());
		Thread.sleep(2000);
		soft.assertEquals(UtilityClass.getExcelData(3, 1), admin.verifyOpenHRMModule3AdminPageTitleOfAdminPage());
		admin.clickOpenHRMModule3AdminPageAddButton();
		soft.assertEquals(UtilityClass.getExcelData(6, 1), addUser.verifyOpenHRMModule3Admin_Add_UserPageAddUserLabel());
		soft.assertEquals(UtilityClass.getExcelData(7, 1), addUser.VerifyOpenHRMModule3Admin_Add_UserPageUserRoleLabel());
		
		
		
		
		
		UtilityClass.SelectOption(driver, 0, addUser.SelectOpenHRMModule3Admin_Add_UserPageUserRole());
		
		soft.assertEquals(UtilityClass.getExcelData(8, 1), addUser.verifyOpenHRMModule3Admin_Add_UserPageEmplyoeeNameLabel());
		
		addUser.inpOpenHRMModule3Admin_Add_UserPageEmpName(UtilityClass.getExcelData(9, 1));
		Thread.sleep(2000);
		
		addUser.chooseOpenHRMModule3Admin_Add_UserPageEmpName(driver, UtilityClass.getExcelData(9, 1));
		soft.assertEquals(UtilityClass.getExcelData(10, 1), addUser.verifyOpenHRMModule3Admin_Add_UserPageStatusLabel());
		
		UtilityClass.SelectOption(driver, 0, addUser.selectHRMModule3Admin_Add_UserPageStatus());
		
		soft.assertEquals(UtilityClass.getExcelData(11, 1), addUser.verifyOpenHRMModule3Admin_Add_UserPageUsernameLabel());
		addUser.inpOpenHRMModule3Admin_Add_UserPageUserName(UtilityClass.getExcelData(12, 1));
		soft.assertEquals(UtilityClass.getExcelData(13, 1), addUser.verifyOpenHRMModule3Admin_Add_UserPagePasswordLabel());
		addUser.inpOpenHRMModule3Admin_Add_UserPagePassword(UtilityClass.getExcelData(14, 1));
		Thread.sleep(500);
		soft.assertEquals(UtilityClass.getExcelData(15, 1), addUser.verifyOpenHRMModule3Admin_Add_UserPageConfirmPasswordLabel());
		addUser.inpOpenHRMModule3Admin_Add_UserPageConfirmPassword(UtilityClass.getExcelData(16, 1));
		Thread.sleep(500);
		soft.assertEquals(UtilityClass.getExcelData(17, 1), addUser.clickOpenHRMModule3Admin_Add_UserPageSaveButton());
		
		Thread.sleep(5000);
		soft.assertAll();
	}
	
	@AfterMethod
	public void catptureSSoffailedTestCase(ITestResult Result) throws IOException
	{
		
		if(Result.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.getScrenshot(driver, TestCaseID);
		}
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	

}


