
package excepcion1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepcion1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int n=0;
        int m=0;
        boolean a= true;
        
        while(a){
        try{
        System.out.println("Ingrese el tamaño del arreglo");
        n = lector.nextInt();
        int [] arreglo = new int [n];
        lector.nextLine();
        System.out.println("Ingrese los numeros enteros del arreglo: ");
        for(int i=0; i<arreglo.length; i++){
            arreglo [i] = lector.nextInt();
        }
        lector.nextLine();
        System.out.println("Su arreglo es: ");
        for(int i=0; i<arreglo.length; i++){
            System.out.print(arreglo[i]+" , ");
        }
        System.out.println("");
        System.out.println("Indique la posicion del arreglo: ");
        m= lector.nextInt();
        a = false;
        for(int i=0; i<arreglo.length; i++){
            if(i==m){
                System.out.println("El numero en dicha posicion es: "+arreglo[i-1]);
            }
        }
        System.out.println("");
               
        }catch(InputMismatchException e1){
            lector.nextLine();
            System.out.println("El valor ingresado no es número entero");
        }catch(NegativeArraySizeException e2){
            lector.nextLine();
            System.out.println("El numero ingresado es negativo");
        }catch(ArrayIndexOutOfBoundsException e3){
            lector.nextLine();
            System.out.println("La posicion esta fuera del arreglo");
        }
        }

    }
    
}
