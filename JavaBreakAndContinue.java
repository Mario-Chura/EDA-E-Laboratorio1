public class JavaBreakAndContinue {

	public static void main(String[] args) {
		// Ejemplo de break
		for (int i = 0; i < 8; i++) {
			if (i== 5) {
				break; 
			}
			System.out.println(i); // Solo imprime hasta 4 porque en 5 se rompe el ciclo		
		}
	}
}
