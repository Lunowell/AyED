package Practica1.ej3;

public abstract class  Persona {

	private String nombre;
	private String apellido;
	private String email;
	
	public Persona (String unNombre, String unApellido, String unEmail) {
		this.nombre = unNombre;
		this.apellido = unApellido;
		this.email = unEmail;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String imprimirDatosComunes() {
		return "Nombre:" + this.getNombre() + " Apellido:" + this.getApellido() + " Email:" + this.getEmail(); //Porque no hace falta poner System.out.println()?
	}
	
}
