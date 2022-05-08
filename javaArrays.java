public class javaArrays{
	public static void main(String[] args){
		/*Java Arrays*/
		//Permiten almacenar multiples valores en una sola variable
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};//matriz de String
		System.out.println(cars[0]); //devuelve el valor en la posicion 0, que seria Volvo
		//Recordamos que los valores de las posciones empiezan en 0 
		cars[0]= "Monster";//cambiamos el valor en la posicion 0
		System.out.println(cars[0]);// imprimira el nuevo valor asignado Monster
		//Para saber la longitud del array
		System.out.println(cars.length);//devolvera 4, el tamaño del Array

		/*Bucle de Arrays*/
		//Usamos en bucle for para recorrer el Array, complementado con lenght para establecer la repeticion del bucle
		for (int i = 0; i < cars.length; i++) {
 		 System.out.println(cars[i]);
		} //MOstrara la lista de los valores del Array
		//For-Each
		//Tambien podemos hacer uso del bucle ForEach
		for (String i : cars) {
 		 System.out.println(i);
		} //De esta manera se realiza el recorrido de manera mas practica	
	} 
	
}
