package Estacion;

public class Dia {

	public int humedad;
	public int temperatura;

	public Dia() {
		
		humedad = 0;
		temperatura = 0;
	}

	@Override
	public String toString() {
		return "[" + humedad + "º/" + temperatura + "%]";
	}
}
