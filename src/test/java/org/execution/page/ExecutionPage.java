package org.execution.page;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import wallet.pagefactory.pageFactory;
import wallet.utils.BaseClass;

public class ExecutionPage extends BaseClass {
	
	@Test
	public void reviewsWallet() throws IOException {
		
		ExecutionPage exe = new ExecutionPage();
		
		loadDriver();
		exe.wait(10);
		loadWalletUrl();
		exe.wait(50);
		pageFactory pf = new pageFactory();
		exe.click(pf.getReviews());
		exe.wait(10);
		exe.mouseHover(pf.getStarsHighlight());
		exe.wait(10);
		exe.mouseHoverclick(pf.getStarsHighlight());
		exe.wait(5);
		exe.click(pf.getSelect());
		exe.wait(2);
		exe.click(pf.getHealthInsurance());
		exe.wait(2);
		exe.type(pf.getTypeReviewCommands(), exe.text());
		exe.wait(5);
		exe.click(pf.getSubmit());
		exe.wait(5);
		exe.click(pf.getClickLogin());
		exe.type(pf.getEmailAddress(), exe.emailid());
		exe.type(pf.getPassWord(), exe.passWord());
		exe.click(pf.getLoginButton());
		exe.wait(5);
		exe.click(pf.getGoToProfile());
		exe.wait(5);
		exe.click(pf.getProfileTag());
		exe.wait(5);
		exe.click(pf.getTestInsurance());
		exe.wait(5);
		String data = exe.getAttribute(pf.getMyReview());
		exe.wait(5);
		Assert.assertTrue(data.contains("I think wallethub is provided biggest financial services to customer"), "validated");
}
}