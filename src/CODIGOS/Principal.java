
package CODIGOS;

import java.util.*;

/**
 *
 * @author Xploit
 */
public class Principal {
    
    public static void main (String args[]){
        System.out.println("Hola mundo");
        
        
        Scanner digito = new Scanner(System.in);
        System.out.println("Digite el primer numeros enteros: ");
        float numero1= digito.nextFloat();
        System.out.println("Digite el segundo numeros enteros: ");
        float numero2= digito.nextFloat();
        
        float mult = numero1 * numero2;
        System.out.println("El resultado es :"+mult);
        
}
    
}
