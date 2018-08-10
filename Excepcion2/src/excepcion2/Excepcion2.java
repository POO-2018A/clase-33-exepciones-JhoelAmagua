
package excepcion2;

import java.util.Scanner;


public class Excepcion2 {

    
    public static void main(String[] args) {
        
        Scanner explorador = new Scanner (System.in);
        int n=0;
        int m=0;
        boolean a=true;
        
        while(a){
            try{
        System.out.println("    Bienvenido");
        System.out.println("Ingrese el numerador: ");
        n  = explorador.nextInt();
        System.out.println("Ingrese el denominador: ");
        m  = explorador.nextInt();
        System.out.println("El resultado es: "+n/m);
        a=false;
        
        }catch(java.lang.ArithmeticException e1){

            System.out.println("No existe division para cero!!!");
        }catch(java.util.InputMismatchException e2){
            explorador.nextLine();
            System.out.println("Ingrese numeros!!!");
        }
        }
        
        
        
    }
    
}
