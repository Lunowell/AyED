package TP3.EJ4;

public class AreaEmpresa {
	private String identificacion;
	private int retardo;
	
	public AreaEmpresa (String id, int tardanza) {
		this.identificacion = id;
		this.retardo = tardanza;
	}
	
	public String getIdentificacion() {
		return this.identificacion;
	}
	public int getRetardo() {
		return this.retardo;
	}
}
