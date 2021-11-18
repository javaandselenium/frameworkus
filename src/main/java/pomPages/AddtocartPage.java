package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage {
	
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement addBtn;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addtocatBtn;
	
	public AddtocartPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getAddBtn() {
		return addBtn;
	}
	
	public void addcart() {
		addtocatBtn.click();
	}

}
