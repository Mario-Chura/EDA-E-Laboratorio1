public class JavaSwitch {

	public static void main(String[] args) {
		// Switch nos permite seleccionar que bloque de codigo se ejecutara
		int dia;
		dia = 1;
		switch (dia) {
		case 1:System.out.println("Hoy es lunes");
		break;
		case 2:System.out.println("Hoy es martes");
		break;
		case 3:System.out.println("Hoy es miercoles");
		break;
		case 4:System.out.println("Hoy es jueves");
		break;
		case 5:System.out.println("Hoy es viernes");
		break;
		case 6:System.out.println("Hoy es sabado");
		break;
		case 7:System.out.println("Hoy es domingo");
		break;
		default: System.out.println("No existe ese dia");
		break;
		}
	}
}
