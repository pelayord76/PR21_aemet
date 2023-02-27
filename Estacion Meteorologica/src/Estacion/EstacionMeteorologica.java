package Estacion;

import java.util.Arrays;

public class EstacionMeteorologica {

	private Dia[] dias;
	private int elementos;

	public EstacionMeteorologica(int elementos) {
		this.elementos = elementos;
		dias = crearEstacion();
	}

	public Dia[] crearEstacion() {

		dias = new Dia[elementos];

		for (int i = 0; i < dias.length; i++) {

			dias[i].humedad = (int) (Math.random() * 70 + 30);
			dias[i].temperatura = (int) (Math.random() * 30 - 10);
		}

		return dias;
	}

	public void ordenarTemperatura() {

		ComparadorT cp = new ComparadorT();
		Arrays.sort(dias, cp);
	}

	public void ordenarHumedad() {

		ComparadorH cp = new ComparadorH();
		Arrays.sort(dias, cp);
	}

	@Override
	public String toString() {

		String devolver = "Este mes tiene " + dias.length + "días. Temperaturas y humedades:";
		for (int i = 1; i < dias.length; i++) {

			devolver += "  [" + i + "]" + dias[i];
		}

		return devolver;
	}
}
