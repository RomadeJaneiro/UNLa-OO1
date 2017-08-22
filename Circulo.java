package modelo;

public class Circulo {
	private Punto origen;
	private double radio;
	public Circulo(Punto origen, double radio) {
		super();
		this.origen = origen;
		this.radio = radio;
	}
	
	public Punto getOrigen()
	{
		return origen;
	}
	public void setOrigen(Punto origen)
	{
		this.origen = origen;
	}
	public double getRadio()
	{
		return radio;
	}
	public void setRadio(Punto radio)
	{
		this.radio = radio.calcularDistancia(origen);
	}
	public boolean equals(Circulo c)
	{
		return ((c.origen==origen)&&(c.radio==radio));
	}

}
