package com.wylonetwork.wylo.admin;

import java.io.IOException;


import org.testng.Reporter;
import org.testng.annotations.Test;

import com.wylo.community.genricUtility.BaseClass;

public class CheckForSigninAndSignoutTest extends BaseClass{

	@Test
	public void checkForSignin() throws IOException, InterruptedException
	{
		Reporter.log("Signin successfull", true);
		
	}
	
}
