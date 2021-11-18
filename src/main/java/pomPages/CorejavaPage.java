package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CorejavaPage {
	
@FindBy(xpath="(//img[@id='image-3'])[2]")
 private WebElement corejava;

public CorejavaPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public void corejavaeSelenium() {
	corejava.click();
}
	
	
}
