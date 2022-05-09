public class JavaRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hallar = factorial(3);
		System.out.println(hallar);
	}
	//Este es un metodo recursivo por se llama a si mismo para poder hallar el factorial de un numero
    public static int factorial (int n){
        int resultado;
        if (n==1) {
        	return 1;
        } else {
        	resultado=factorial(n-1)*n;
        }
        return resultado;
    }

}
