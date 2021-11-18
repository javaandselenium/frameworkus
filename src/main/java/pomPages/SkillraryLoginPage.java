package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {

	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gerasBtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillraryapp;
	
	@FindBy(name="q")
	private WebElement serachtb;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement gobtn;
	
	
	public SkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void gearsButton() {
		gerasBtn.click();
	}
	
	public void serachTextBox(String name) {
		serachtb.sendKeys (name);
	}
	
	public void serchButton() {
		gobtn.click();
	}
	
	public void skillraryDemoApp() {
		skillraryapp.click();
	}
	
	
	
	
	
}
