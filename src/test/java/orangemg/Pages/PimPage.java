package orangemg.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import orangemg.Steps.ButtonPages;

public class PimPage {

	private ButtonPages buttonPages;
	
	@FindBy(how = How.XPATH, using = "//input[@name='firstName']")
    private WebElement inputFirstName;
	
	@FindBy(how = How.XPATH, using = "//input[@name='lastName']")
    private WebElement inputLastName;
	
	public PimPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
	}
	
	public void goAddEmployee() {
		buttonPages.botonPim();
		buttonPages.botonAdd();
	}
	
	public void regAddEmployee(String firstName, String lastName) {
		inputFirstName.sendKeys(firstName);
		inputLastName.sendKeys(lastName);
		buttonPages.botonSave();
	}
}
