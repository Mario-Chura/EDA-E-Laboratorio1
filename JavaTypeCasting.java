public class JavaTypeCasting {
    int entero = 26;
    double decimal = entero; //Pasamos de un dato entero a un decimal
    System.out.println(entero); //Imprime 26
    System.out.println(decimal);// Imprimer 26.0 por que es un doble
    //Segunda manera de hacer casting
    double decimal2 = 23.45d;
    int entero2 = (int) decimal2;
    System.out.println(decimal2); // Imprime 23.45
    System.out.println(entero2); // Imprime solo la parte entera 23
}

