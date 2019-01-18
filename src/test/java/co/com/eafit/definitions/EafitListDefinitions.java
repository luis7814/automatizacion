package co.com.eafit.definitions;

import co.com.eafit.steps.EafitListStep;
import co.com.eafit.steps.EafitStep;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class EafitListDefinitions {
	
	@Steps
	private EafitListStep eafitListStep;  
	
	@Given("^que Yeison quiere escribir un comentario a la Universidad EAFIT$")
	public void queLuisQuiereEscribirUnComentarioALaUniversidadEAFIT() throws Exception {
		eafitListStep.cargarUrlYescribirComentario();
	}


	@When("^el envia el comentario nombre$")
	public void elEnviaElComentarioNombre(DataTable dataTable) throws Exception {
		eafitListStep.enviarMensaje(dataTable);
	}

	@Then("^el visualiza el pantalla el mensaje \"([^\"]*)\"\\.$")
	public void elVisualizaElPantallaElMensaje(String mensajeRespuesta) throws Exception {
		eafitListStep.visualizarMensaje(mensajeRespuesta);
	}
	
}

