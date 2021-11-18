package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shareviatwitter {
	
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement play;
	
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pause;
	
	@FindBy(xpath="//span[contains(text(),'Share via Twitter')]")
	private WebElement twitter;
	
	public Shareviatwitter(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void playButton() {
		play.click();
	}
	
	public void pauseButton() {
		pause.click();
	}
	
	public void twitterButton() {
		twitter.click();
	}

}
