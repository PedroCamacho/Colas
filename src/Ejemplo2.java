import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Ejemplo2 {

	public static void main(String[] args) {
		Queue<String> miColeccion = new LinkedList<>();
		
		miColeccion.add("Collection");
		miColeccion.add("List");
		miColeccion.add("Set");
		miColeccion.add("SortedSet");
		miColeccion.add("Map");

		String elto;
		Iterator<String> paseador = miColeccion.iterator();
		while (paseador.hasNext()) {
			elto = paseador.next();
			if (elto.charAt(0) == 'S')
				paseador.remove();
			else
				System.out.println(elto);
		}
		
	}
}
