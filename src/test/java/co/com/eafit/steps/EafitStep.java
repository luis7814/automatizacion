package co.com.eafit.steps;

import co.com.eafit.pageobject.EafitPage;
import net.thucydides.core.annotations.Step;

public class EafitStep {	
	EafitPage eafitPage;
	
	
	@Step
	public void cargarUrlYescribirComentario() {
		// TODO Auto-generated method stub
		eafitPage.open();
	}
	
	@Step
	public void enviarMensaje(String nombre, String correo, String telefono, String ciudad, String comentario) {
		// TODO Auto-generated method stub
		eafitPage.enviarMensaje(nombre, correo, telefono, ciudad, comentario);
	}
	
	@Step
	public void visualizarMensaje(String mensajeRespuesta) {
		// TODO Auto-generated method stub
		eafitPage.visualizarMensaje(mensajeRespuesta);
	}
	

}
