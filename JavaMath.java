public class JavaMath {

	public static void main(String[] args) {
		// Metodo maximo me retorna el maximo 
		int maximo = Math.max(25, 87);
		System.out.println(maximo); // Imprime 87
		// Metodo minimo me retorna el valor minimo
		int minimo = Math.min(15, 85);
		System.out.println(minimo); // Imprime 15
		// Metodo raiz cuadrada
		double raiz = Math.sqrt(64);
		System.out.println(raiz); // Imprime 8
		// Metodo valor absoluto
		double abs = Math.abs(-158.23);
		System.out.println(abs); // Imprime 158.23
		// Metodo random
		int aleatorio = (int) (Math.random()*200);
		System.out.println(aleatorio); // Imprime numero aleatorio del 0 al 200
	}
}
