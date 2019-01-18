package co.com.eafit.utils;

public class Utils {
	
	
	public Persona registraDatos() {
		
		Persona persona = new Persona();
		
		persona.setNombre("Luis");
		persona.setCorreo("labs@gmail.com");
		persona.setTelefono("3154208057");
		persona.setCiudad("Medellin");
		persona.setComentario("Buena universidad!");
		
		return persona;
		
		
	}

}
