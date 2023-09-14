
package CODIGOS;

import java.util.*;
import java.util.InputMismatchException;

/**
 *
 * @author Xploit
 */
public class Principal {
    
    public static void main (String args[]){
        double num = 0;
        System.out.println("Programa que calcula el area de un triangulo");
        
        Scanner digito = new Scanner(System.in);
        
        try{
        System.out.println("Digite la base del triangulo: ");
        double base= digito.nextDouble();
        System.out.println("Digite la altura del trinagulo: ");
        double altura= digito.nextDouble();
        
        double area = (base*altura)/2;
        System.out.println("El area del triangulo es :"+area +"cm");
        
}
        catch(InputMismatchException ex){
            System.out.println("Debe de ingresar obligatoriamente un numero tipo double ");
        }
    }
    
}
