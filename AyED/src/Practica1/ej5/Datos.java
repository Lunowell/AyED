package Practica1.ej5;

public class Datos {
	
	private int min;
	private int max;
	private double prom;
	
	public Datos (int unMin, int unMax, double unProm) {
		this.min = unMin;
		this.max = unMax;
		this.prom = unProm;
	}
	public Datos () {
		
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public double getProm() {
		return prom;
	}
	public void setProm(double prom) {
		this.prom = prom;
	}
	
	@Override
    public String toString() {
        return "Max=" + this.max + " Min=" + this.min + " Prom=" + prom;
    }
	
}
