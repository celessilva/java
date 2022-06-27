package practica;

import java.util.Scanner;

public class Main {
public static void main (String[] args){

int vector[]= new int[15];
    Scanner teclado= new Scanner(System.in);

    for (int i=0;i<15;i++){
        System.out.println("ingrese un numero para el vector");
        vector[i]= teclado.nextInt();
    }
    int cont=0;
    for (int i=0;i<15;i++){
     if (vector[i]==3)  {
        cont=cont+1;
     }
    }
        System.out.println("La cantidad de numeros 3 que hay en este vector son: " +cont);


/* se realiza un vector que cuenta la cantidad de veces que se carga en el, el numero 3 */

    }

}
