package testScripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.CorejavaPage;
import pomPages.Shareviatwitter;
import pomPages.SkillraryLoginPage;

public class ShareViaTwitter extends BaseClass{
	@Test
	public void tc2() throws FileNotFoundException, IOException, InterruptedException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.serachTextBox(pdata.getPropertyData("courseName"));
		s.serchButton();
		
		CorejavaPage c=new CorejavaPage(driver);
		c.corejavaeSelenium();
		
		Thread.sleep(3000);
		
		Shareviatwitter t=new Shareviatwitter(driver);
		utilies.switchToframe(driver);
		t.playButton();
		Thread.sleep(10000);
		t.pauseButton();
		utilies.switchBack(driver);
		Thread.sleep(5000);
		t.twitterButton();
		Thread.sleep(5000);
		
		
		
		
	}

}
