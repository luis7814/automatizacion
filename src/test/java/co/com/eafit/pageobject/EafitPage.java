package co.com.eafit.pageobject;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.eafit.edu.co/institucional/contacto/Paginas/contacto-eafit.aspx")
public class EafitPage extends PageObject{

	
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
	
	
	public void enviarMensaje(String nombre, String correo, String telefono, String ciudad, String comentario) {
		// TODO Auto-generated method stub
		getDriver().switchTo().frame(0);
		txtNombre.sendKeys(nombre);
		txtCorreo.sendKeys(correo);
		txtTelefono.sendKeys(telefono);
		txtCiudad.sendKeys(ciudad);
		txtComentario.sendKeys(comentario);
		btnEnviar.click();
		
		
	}

	public void visualizarMensaje(String mensajeRespuesta) {
		// TODO Auto-generated method stub
		
		String mensaje = lblMensaje.getText();
		assertThat(mensaje, Matchers.containsString(mensajeRespuesta));
		
	}
	
	

}
