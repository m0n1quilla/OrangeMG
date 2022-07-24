package orangemg.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPages {
	
	@FindBy(how = How.ID, using = "btnLogin")
    private WebElement botonLogin;
	
	@FindBy(how = How.XPATH, using = "//a[@id = 'menu_pim_viewPimModule']")
    private WebElement btnPim;
	
	@FindBy(how = How.XPATH, using = "//form//div//input[@value='Add']")
    private WebElement btnAdd;	
	
	@FindBy(how = How.ID, using = "btnSave")
    private WebElement btnSave;		
	
	@FindBy(how = How.XPATH, using = "menu_leave_viewLeaveModule")
    private WebElement btnLeave;	
	
	public ButtonPages(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void botonLogin() {
		botonLogin.click();
	}
	
	
	public void botonPim() {
		btnPim.click();
	}

	public void botonAdd() {
		btnAdd.click();
	}
	
	public void botonSave() {
		btnSave.click();
	}
		
	public void botonLeave() {
		btnLeave.click();
	}
		
	
}
