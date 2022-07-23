package orangemg.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	//private ButtonPages buttonPages;
	
	@FindBy(how = How.ID, using = "txtUsername")
    // nombre de la variable que guarda @FindBy
    private WebElement inputUserName;
	
	@FindBy(how = How.ID, using = "txtPassword")
    // nombre de la variable que guarda @FindBy
    private WebElement inputPassword;
	
	//esto es un constructor
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		//this.buttonPages = new ButtonPages(driver);
	}
	
	//esto es un método para ingresar usuario y contraseña 
	/*public void regLogin(String userName, String passw) {
		inputUserName.sendKeys(userName);
		inputPassword.sendKeys(passw);
		buttonPages.botonLogin();
	}*/
}

