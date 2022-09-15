package org.CATPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutCATpomclass {
//(//div[contains(@class,'z6erz7xo on4d8346 jkp44r48 l10tt5db s8sjc6am myo4itp8 ekq1a7f9 pym4i58u ldembo95 mwa1sm0y hi69')])[1]
	
		
		@FindBy(xpath=("(//div[@class='aglvbi8b om3e55n1 i8zpp7h3 g4tp4svg'])[1]")) private WebElement log ;
		public void logAction1()
		{
			log.click();
		}
		@FindBy(xpath=("(//div[@class='jroqu855 nthtkgg5'])[5]")) private WebElement log2 ;
	//	(//div[@class='j83agx80 cbu4d94t ew0dbk1b irj2b8pg'])[5]
	//	(//div[contains(@class,'qzhwtb')])[33]
		
		
		//(//div[contains(@class,'qzhwtbm')])[5]
		public void Finallogout()
		{
			log2.click();
		}
		
		
		@FindBy(xpath="(//div[contains(@class,'ehxjyohh kr520xx4 ')])[1]") private WebElement logo;
		public void isDisplayed()
		{
			boolean a=logo.isDisplayed();
			if(a==true)
			{
				System.out.println("Facebbok  logo is displayed successfully");
			}
		}
		
		
		public LogoutCATpomclass(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
	

}
