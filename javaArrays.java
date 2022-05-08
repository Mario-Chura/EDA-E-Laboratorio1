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
		
		/*Arrays Multidimensionales*/
		//Son Arrays de Arrays
		//Para crear Arrays Bidimensionales se agrega cada matriz dentro del conjunto de llaves
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} }; //Aqui tenemos un Array con dos Arrays como elementos
		//Para acceder a los elementos, especificamos el primer numero como la posicion del array y el segundo como la posicion del numero dentro del Array elegido
		int x = myNumbers[0][2];
		System.out.println(x); // Imprimira 3
		//Para realizar el recorrido de la matriz bidimensional hacemos uso del Bucle FOR Anidado
		for (int i = 0; i < myNumbers.length; ++i) {
		      for(int j = 0; j < myNumbers[i].length; ++j) {
		        System.out.println(myNumbers[i][j]);
		      }
	        }
		
	} 
	
}
