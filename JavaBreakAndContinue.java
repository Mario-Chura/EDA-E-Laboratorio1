public class JavaBreakAndContinue {

	public static void main(String[] args) {
		// Ejemplo de break
		for (int i = 0; i < 8; i++) {
			if (i== 5) {
				break; 
			}
			System.out.println(i); // Solo imprime hasta 4 porque en 5 se rompe el ciclo		
		}
		// Ejemplo de continue
		for (int i = 0; i < 7; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println(i); // Imprime del 0 al  6 sin rectriccion cuando llega a ser  3
		}
		
		// Ejemplo while y break
        int x = 0;
        while(x < 10) {
            if(x == 6) {
                break;
            }
            System.out.println("i: " + x);
            x++;
        }
        
        System.out.println("el ultimo valor de i es: " + x);
        
        // Ejemplo while y continue
        for (int i = 0; i < 10; i++) {
            if(i == 6) {
                continue;
            }
            System.out.println("i: " + i);
        }
	}
}
