package testScripts;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class AddingCourseTocart extends BaseClass {
	
	@Test
	public void tc1() throws InterruptedException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillraryDemoApp();
		
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		utilies.switchTabs(driver);
		utilies.mouseHover(driver,sd.getCoursetab());
		sd.seleniumtrainingtab();
		
		
		AddtocartPage ad=new AddtocartPage(driver);
		utilies.doubleClick(driver,ad.getAddBtn());
		ad.addcart();
		utilies.alertPopup(driver);
		
	}

}
