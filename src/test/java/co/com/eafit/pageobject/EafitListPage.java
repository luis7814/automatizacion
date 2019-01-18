package co.com.eafit.pageobject;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;

import co.com.eafit.utils.Persona;
import co.com.eafit.utils.Utils;
import cucumber.api.DataTable;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.eafit.edu.co/institucional/contacto/Paginas/contacto-eafit.aspx")
public class EafitListPage extends PageObject{

	
	@FindBy(id="Field1")
	private WebElementFacade txtNombre;
	
	@FindBy(id="Field3")
	private WebElementFacade txtCorreo;
	
	@FindBy(id="Field4")
	private WebElementFacade txtTelefono;
	
	@FindBy(id="Field5")
	private WebElementFacade txtCiudad;
	
	@FindBy(id="Field6")
	private WebElementFacade txtComentario;
	
	@FindBy(id="saveForm")
	private WebElementFacade btnEnviar;
	
	@FindBy(xpath="//*[@id=\"container\"]/form/h2")
	private WebElementFacade lblMensaje;
	
	
	/*public void enviarMensaje(DataTable dataTable) {
		// TODO Auto-generated method stub
		
		List<List<String>> dato = dataTable.raw();
		
		getDriver().switchTo().frame(0);
		
		txtNombre.sendKeys(dato.get(1).get(0));
		txtCorreo.sendKeys(dato.get(1).get(1));
		txtTelefono.sendKeys(dato.get(1).get(2));
		txtCiudad.sendKeys(dato.get(1).get(3));
		txtComentario.sendKeys(dato.get(1).get(4));
		
		btnEnviar.click();
		
		
	}*/

	public void enviarMensaje(DataTable dataTable) {
		// TODO Auto-generated method stub
		
		Persona persona = new Persona();
		Utils utils = new Utils();
		
		persona = utils.registraDatos();
		
		getDriver().switchTo().frame(0);
		
		txtNombre.sendKeys(persona.getNombre());
		txtCorreo.sendKeys(persona.getCorreo());
		txtTelefono.sendKeys(persona.getTelefono());
		txtCiudad.sendKeys(persona.getCiudad());
		txtComentario.sendKeys(persona.getComentario());
		
		btnEnviar.click();
		
		
	}
	public void visualizarMensaje(String mensajeRespuesta) {
		// TODO Auto-generated method stub
		
		String mensaje = lblMensaje.getText();
		assertThat(mensaje, Matchers.containsString(mensajeRespuesta));
		
	}
	
	

}
