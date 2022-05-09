public class JavaMethodParameters {

	public static void main(String[] args) {
		String resolver = Maximo(25,18);// Al llamar al metodo se piden argumentos
		System.out.println(resolver);
		String mul5 = MultiploDeCinco(6);
		System.out.println(mul5);
	}
	// Este metodo se encarga de hallar el mayor de dos numeros enteros introducidos y te devuelve un String diciendo cual es el mayor
	public static String Maximo (int x, int y) { // En el metodo hablamos de parametros
		int mayor = Math.max(x, y);
		return "El mayor de los dos numeros es: "+ mayor;
	}
	// Este metodo con if/else halla si un numero es multiplo de  5
	public static String MultiploDeCinco (int x) {
		if (x%5 == 0) {
			return "El numero es multiplo de 5";
		} else {
			return "El numero no es multiplo de 5";
		}
	}

}
