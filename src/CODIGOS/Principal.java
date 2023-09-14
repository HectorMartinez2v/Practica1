
package CODIGOS;

import java.util.*;

/**
 *
 * @author Xploit
 */
public class Principal {
    
    public static void main (String args[]){
        System.out.println("Programa que calcula el area de un triangulo");
        
        
        Scanner digito = new Scanner(System.in);
        System.out.println("Digite la base del triangulo: ");
        double base= digito.nextDouble();
        System.out.println("Digite la altura del trinagulo: ");
        double altura= digito.nextDouble();
        
        double area = (base*altura)/2;
        System.out.println("El area del triangulo es :"+area +"cm");
        
}
    
}
