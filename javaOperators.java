public class javaOperators{
	public static void main(String[] args){
		/*Java Operators*/
		//Se utilizan para realizar operaciones en variables y valores
		int l = 100 + 50;
		//El operador + se usa tambien para sumar variable y un valor, o variable y variable
		int s1 = 100 + 50;        // (100 + 50)resultado 150
		int s2 = s1 + 250;      // (150 + 250)resultado 400
		int s3 = s2 + s2;     // (400 + 400) resultado 800
		
		/*Operadores Aritmeticos*/
		int x = 45;
    		int y = 33;
		System.out.println(x + y);//adicion
		System.out.println(x - y);//sustraccion
		System.out.println(x * y);//multiplicacion
		System.out.println(x / y);//division
		System.out.println(x % y);//modulo
		System.out.println(++x);//incremento
		System.out.println(--y);//decremento


		/*Operadores de asignacion*/
		// =, +=, -=, *=, /=, %=, &=, |=, ^=, >>=, <<=
		int z = 5;// = para asignar un valor 
    		z += 3;//para incrementar en 3 el valor de la variable
    		System.out.println(z);
    		z -= 4;//para restar 3 al valor de la variable
    		System.out.println(z);
		z *= 5;//para multiplicar 5 al valor de la variable
    		System.out.println(z);
		z /= 5;//para dividir 5 al valor de la variable
    		System.out.println(z);
		z %= 4;//para sacar el modulo al valor de la variable
    		System.out.println(z);
		z &= 4;//para realizar la operacion AND de bit a bit con el valor de la variable
    		System.out.println(z);
		z |= 4;//para realizar la operacion OR de bit a bit con el valor de la variable
    		System.out.println(z);
		z ^= 4;//para operar OR exclusivo verdadero solo si una de ellos es verdadero
    		System.out.println(z);
		z >>= 4;//para eliminar BIT a la derecha del valor de la variable
    		System.out.println(z);
		z <<= 4;//para añadir BIT con valor 0 al valor de la variable
    		System.out.println(z);

		/*Operadores de combinacion*/
		//==, !=,>,<,>=,>=
		int m=5,n=6;
		System.out.println(m==n); //Operador de comparacion de igualdad
		System.out.println(m!=n); //Operador diferente de
		System.out.println(m>n); //Operador mayor que
		System.out.println(m<n); //Operador menor que 
		System.out.println(m>=n); //Operador mayor o igual
		System.out.println(m<=n); //Operador menor o igual
		
		/*Operadores Logicos*/
		// &&, ||, !
		int p = 5;
    		System.out.println(p > 3 && p < 10); // Operador &&. Retorna TRUE porque se cumplen las dos condiciones
		System.out.println(p > 3 || p < 4); // Operador ||. Retorna TRUE porque se cumplen una de las dos condiciones
		System.out.println( !(p > 3 && p < 10) ); // Operador !. Retorna FALSE porque es negacion del resultado
	}
	
}
