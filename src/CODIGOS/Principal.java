
package CODIGOS;

import java.util.*;

/**
 *
 * @author Xploit
 */
public class Principal {
    
    public static void main (String args[]){
        System.out.println("Programa que calcula el area de un rectangulo");
        
        
        Scanner digito = new Scanner(System.in);
        System.out.println("Digite la base del rectangulo: ");
        float base= digito.nextFloat();
        System.out.println("Digite la altura del rectangulo: ");
        float altura= digito.nextFloat();
        
        float rectangulo = base*altura;
        System.out.println("El area del rectangulo es :"+rectangulo+ "cm");
        
}
    
}
