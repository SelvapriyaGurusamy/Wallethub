package org.execution.page;

import java.io.IOException;
import java.util.Scanner;

import org.testng.annotations.Test;

import wallet.pagefactory.FbFactory;
import wallet.utils.BaseClass;

public class FacebookExe extends BaseClass {
	
	@Test

	public static void fb() throws InterruptedException, IOException {
		FacebookExe fbe = new FacebookExe();
		
		
		loadDriver();
		loadUrl();
		FbFactory ff = new FbFactory();
		fbe.type(ff.getEmailid(), fbe.getUsername());
		fbe.type(ff.getPassword1(), fbe.getPassword());
		fbe.click(ff.getLoginbutton());
		System.out.println("Hello World");
	}

}
