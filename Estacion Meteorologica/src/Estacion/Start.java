package Estacion;

public class Start {

	public static void main(String[] args) {

		EstacionMeteorologica aemet = new EstacionMeteorologica(30);
		System.out.println(aemet);

		// ordena los datos por el criterio de la temperatura y los imprime.
		aemet.ordenarTemperatura();
		System.out.println(aemet);

		// ordena los datos por el criterio de la humedad y los imprime.
		aemet.ordenarHumedad();
		System.out.println(aemet);
	}
}
