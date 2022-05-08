public class javaWhileLoop {
  public static void main(String[] args) {
    
	/*Bucles en Java*/
    	//Permiten ejecutar una linea de codigo tantas veces como lo establezca una condicion
	//Ahorran tiempo y reducen errores
	
    	/*Ciclo While*/
	//Recorre un codigo siempre que la condicion devuelva true
	int i = 0;
	while (i <= 10) {//El bucle mostrara los valores del cero hasta el 10
	  System.out.println(i);
	  i++;
	}
	
	/*Bucle Do-While*/
	//Es similar al bucle While, solo que ejecutara siempre una vez la linea de codigo
	//Despues de ello verificara si la condicion es verdadera
	int j = 0;
	do {
	  System.out.println(j);
	  j++;
	}
	while (j < 5);
	//Se imprimira si o si el valor inicial de j, despues de ello se mostrara los valores menores de 5
	
  }
}
