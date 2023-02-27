package Estacion;

import java.util.Comparator;

public class ComparadorH implements Comparator<Dia> {

	@Override
	public int compare(Dia o1, Dia o2) {

		int devolver = o1.humedad - o2.humedad;
		return devolver;
	}

}
