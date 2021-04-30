package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Database {

	private static List<Planeta> lista = new ArrayList<>();
	private static int id = 1;

	public static void adiciona(Planeta planeta) {
		planeta.setId(id++);
		lista.add(planeta);
	}

	public static void remove(int id) {
		Iterator<Planeta> it = lista.iterator();
		while (it.hasNext()) {
			Planeta planeta = it.next();
			if (planeta.getId() == id) {
				it.remove();
			}
		}
	}

	public static List<Planeta> getPlanetas() {
		return lista;
	}

	public static Planeta buscaPlanetasID(int id) {
		for (Planeta planetas : lista) {
			if (planetas.getId() == id) {
				return planetas;
			}
		}
		return null;
	}

}
