public class javaVariables{
	public static void main(String[] args) {
		String name = "Fernando";
		int myNum = 20;
		myNum = 25;  // myNum es ahora 25

		/*Final Variables*/
		final int myNumFin = 15;
		myNumFin = 20;  // se genera un error: no se puede asignar un valor a una variable final

		/*Otros Tipos*/
		int myNumType = 5;//Tipo entero
		float myFloatNum = 5.99f;//Tipo Float o Double (Numeros Decimales)
		char myLetter = 'D';//Tipo Caracter
		boolean myBool = true;//Tipo Booleano (True/False)
		String myText = "Hello";//Tipo String (Cadena de Texto)

		/*Imprimir variables*/
		//Hacemos uso del Sistema de Impresion println() 
		System.out.println("Hello " + name);
		//Sumando cadenas
		String lastName = "Coyla";
		String fullName = name + lastName;//Asignamos en otra variable del mismo tipo
		System.out.println(fullName);//Mostramos esa variable que contine la suma de cadenas
		//Mostrar suma de variables, sin necesidad de asignarla a una variable
		int x = 85;
		int y = 66;
		System.out.println(x + y); // MOstrara el valor de x+y

			
	}	

}
