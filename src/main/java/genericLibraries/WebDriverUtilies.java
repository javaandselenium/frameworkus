package genericLibraries;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilies {
	
	public void dropDown(WebElement ele,String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	
	public void mouseHover(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	public void doubleClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
}
	
	public void switchToframe(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	
	public void switchBack(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	public void alertPopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	
	public void scrollBar(WebDriver driver,int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scollBy("+x+","+y+")");
	}
	
	public void switchTabs(WebDriver driver) {
		Set<String> window = driver.getWindowHandles();
		
		for(String allwin:window) {
			driver.switchTo().window(allwin);
		}
	}

	
	
	
}
