package orangemg.Definitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import orangemg.Steps.Conexion;



public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();

	

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}

}