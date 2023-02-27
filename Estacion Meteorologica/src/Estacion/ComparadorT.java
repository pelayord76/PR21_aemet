package Estacion;

import java.util.Comparator;

public class ComparadorT implements Comparator<Dia>{

	@Override
	public int compare(Dia o1, Dia o2) {

		int devolver = o1.temperatura - o2.temperatura;
		return devolver;
	}

}
