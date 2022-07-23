package orangemg.Definitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import orangemg.Pages.LoginPage;
import orangemg.Pages.PimPage;
import orangemg.Steps.Conexion;


public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private LoginPage loginPage = new LoginPage(driver);
	private PimPage pimPage = new PimPage(driver);

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}

	@And("^registrar usuario (.*) y password (.*)$")	
	public void regLogin(String userName, String passw) {
		this.loginPage = new LoginPage(driver);
		this.loginPage.regLogin(userName,passw);
	}
	
	@And("^ir a opción agregar empleado$")
	public void regPim() {
		this.pimPage = new PimPage(driver);
		this.pimPage.goAddEmployee();
	}
	
}