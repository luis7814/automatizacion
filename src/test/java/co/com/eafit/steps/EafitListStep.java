package co.com.eafit.steps;

import co.com.eafit.pageobject.EafitListPage;
import co.com.eafit.pageobject.EafitPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;

public class EafitListStep {	
	EafitListPage eafitListPage;
	
	
	@Step
	public void cargarUrlYescribirComentario() {
		// TODO Auto-generated method stub
		eafitListPage.open();
	}
	
	@Step
	public void enviarMensaje(DataTable dataTable) {
		// TODO Auto-generated method stub
		eafitListPage.enviarMensaje(dataTable);
	}
	
	@Step
	public void visualizarMensaje(String mensajeRespuesta) {
		// TODO Auto-generated method stub
		eafitListPage.visualizarMensaje(mensajeRespuesta);
	}
	

}
