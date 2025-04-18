package Practica1.ej3;

public class Profesor extends Persona{
	
	private String catedra;
	private String facultad;
	
	public Profesor (String unNombre, String unApellido, String unEmail, String unaCatedra, String unaFacultad) {
		super (unNombre, unApellido, unEmail);
		this.catedra = unaCatedra;
		this.facultad = unaFacultad;
	}

	public String getCatedra() {
		return catedra;
	}

	public void setCatedra(String catedra) {
		this.catedra = catedra;
	}


	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	
	
	public String  tusDatos() {
		return 	super.imprimirDatosComunes() + "Catedra: " + this.getCatedra() + " Facultad: " + this.getFacultad();  //Porque no hace falta poner System.out.println()?
	}
}
