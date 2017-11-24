package com.roles.scripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.POM.BoilerPlate;
import com.POM.Common;
import com.POM.HomePage;
import com.POM.TenantAdminManageTenant;
import com.canvashomepage.scripts.BaseTest;

public class EngineerCannotDeleteLocalBoilerPlate extends BaseTest
{
@Test
public void testEngineerCannotDeleteLocalBoilerPlate()
{
	System.out.println("******************************EngineerCannotDeleteLocalBoilerPlate******************************");
	Reporter.log("******************************EngineerCannotDeleteLocalBoilerPlate******************************");
	HomePage homepage=new HomePage(driver);
	homepage.tenantadminLogin();
	TenantAdminManageTenant tenantadminmanagetenant=new TenantAdminManageTenant(driver);
	tenantadminmanagetenant.convertUserToEngineer();
	Common common=new Common(driver);
	common.logOut();
	homepage.validLogIn();
	BoilerPlate boilerplate=new BoilerPlate(driver);
	boilerplate.clickLocalBoilerplateLink();
	String av=driver.getCurrentUrl();
	String ev="https://capedev.mindtree.com/#/main/home";
	common.logOut();
	homepage.tenantadminLogin();
	tenantadminmanagetenant.convertUserToEngineer();
	Assert.assertEquals(av, ev);
	System.out.println("******************************EngineerCannotDeleteLocalBoilerPlate******************************");
	Reporter.log("******************************EngineerCannotDeleteLocalBoilerPlate******************************");
}
}
