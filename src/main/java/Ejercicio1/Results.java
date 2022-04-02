
package Ejercicio1;

import java.util.Scanner;

public class Results {
    
    
        public static void main(String [] asrg) {
        Scanner leer = new Scanner (System.in);
        
        House H = new House();
        
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::\n");
        System.out.println("El N° de su casa asignada es: " +H.getNcasa());
        System.out.println("El numero de su pasaje es: " +H.getNpasaje());
        System.out.println("El nombre de su calle asignada es: " +H.getNombreC());
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::\n");
        
        
    }
    
}
    

    
