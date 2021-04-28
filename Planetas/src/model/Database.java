package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Database {

	private static List<Planetas> lista = new ArrayList<>();
	private static int id = 1;

	public static void adiciona(Planetas planetas) {
		planetas.setId(id++);
		lista.add(planetas);
	}

	public static void remove(int id) {
		Iterator<Planetas> it = lista.iterator();
		while (it.hasNext()) {
			Planetas planetas = it.next();
			if (planetas.getId() == id) {
				it.remove();
			}
		}
	}

	public static List<Planetas> getPlanetas() {
		return lista;
	}

	public static Planetas buscaPlanetasID(int id) {
		for (Planetas planetas : lista) {
			if (planetas.getId() == id) {
				return planetas;
			}
		}
		return null;
	}

}
