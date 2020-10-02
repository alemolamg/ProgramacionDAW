package Bloque1;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		int     num1;
        float   num2;
        double  num3;

        Scanner leer = new Scanner (System.in);

        System.out.println ("Introduce Número entero");
        num1 = leer.nextInt();

        System.out.println ("Introduce Número Flotante");
        num2 = leer.nextFloat();

        System.out.println ("Introduce Número Double");
        num3 = leer.nextDouble();

        System.out.println ("Números: " + num1 +"; " + num2 +"; " + num3);
		
	}     

}