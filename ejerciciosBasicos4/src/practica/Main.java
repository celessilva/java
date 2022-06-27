package practica;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese grados centigrados: ");
        double centigrados= sc.nextDouble();
        double fahrenheit = 32;
        double temperatura = fahrenheit + (9 * centigrados/5);
        System.out.println("La temperatura en grados fahrenheit es :" + " " +temperatura);

	// 4. Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. La fórmula correspondiente es: F = 32 + ( 9 * C / 5)
    }
}
