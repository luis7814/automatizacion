package co.com.eafit.steps;

import co.com.eafit.pageobject.DemoPage;
import net.thucydides.core.annotations.Step;

public class DemoStep {

	private DemoPage demoPage;

	@Step
	public void cargarUrl() {
		demoPage.open();

	}

	@Step
	public void escribirCredenciales(String usuario, String clave) {
		// TODO Auto-generated method stub
		demoPage.realizarAutenticacion(usuario, clave);
	}

	public void verificarAcceso(String titulo) {
		demoPage.verificarTitulo(titulo);
	}

}
