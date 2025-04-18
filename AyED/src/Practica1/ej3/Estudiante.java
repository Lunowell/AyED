package Practica1.ej3;

public class Estudiante extends Persona {

	private String comision;
	private String direccion;
	
	public Estudiante (String unNombre, String unApellido, String unEmail, String unaComision, String unaDireccion) {
		super (unNombre, unApellido, unEmail);
		this.comision = unaComision;
		this.direccion = unaDireccion;
	}

	

	public String getComision() {
		return comision;
	}

	public void setComision(String comision) {
		this.comision = comision;
	}


	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String tusDatos() {
		return super.imprimirDatosComunes() + "Comision: " + this.getComision() + " Direccion: " + this.getDireccion();  //Porque no hace falta poner System.out.println()?
	}
	
}
