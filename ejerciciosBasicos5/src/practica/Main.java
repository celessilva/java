package practica;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ingrese el radio de su cirunferencia: ");
        float radio = sc.nextFloat();
        double pi= 3.14;
        double longitud= 2*pi*radio;
        double area= pi*radio*radio;
        System.out.println("la longitud es :"+" "+ longitud);
        System.out.println("El area es :"+""+ area);

        
	/* 5. Programa que lee por teclado el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud y
        el área de la circunferencia. Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2 */
    }
}
