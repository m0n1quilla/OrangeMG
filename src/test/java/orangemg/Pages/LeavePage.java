package orangemg.Pages;

import org.openqa.selenium.WebDriver;

import orangemg.Steps.ButtonPages;

public class LeavePage {
	
	private ButtonPages buttonPages;
	
    public LeavePage(WebDriver driver) {
		this.buttonPages = new ButtonPages(driver);
	}
    
    public void findEmployeeActions() {
    	buttonPages.botonLeave();
    }

}
