/*Sobrecarga de Metodos*/
//Permite tener varios metodos con el mismo nombre pero con diferentes valores de retorno
/*
  *int myMethod(int x)
  *float myMethod(float x)
  *double myMethod(double x, double y)
*/

public class javaMethodOverloading{
	public static void main(String[] args){
		int myNum1 = plusMethod(18,15);
		double myNum2 = plusMethod(4.8, 4.22);
		System.out.println("int: " + myNum1);
  		System.out.println("double: " + myNum2);
	}
	static int plusMethod(int x, int y) {
  		return x + y;
	}	

	static double plusMethod(double x, double y) {
		return x + y;
	}

}

