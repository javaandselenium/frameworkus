package testScripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.FacebookPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class FacebookLike2 extends BaseClass{
	@Test
	public void tc3() throws FileNotFoundException, IOException {
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
	s.gearsButton();
	s.skillraryDemoApp();
	
	utilies.switchTabs(driver);
	SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
	utilies.dropDown(sd.getTestingdd(),pdata.getPropertyData("coursedd"));
	
	TestingPage t=new TestingPage(driver);
	t.facebookIcon();
	
	FacebookPage fb=new FacebookPage(driver);
	fb.likebutton();
	
	}

}
