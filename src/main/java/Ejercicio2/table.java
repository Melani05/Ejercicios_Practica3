
package Ejercicio2;

import Ejercicio2.Estudent;
import java.util.Hashtable;
import java.util.Scanner;

public class table {
    
    public static void main(String[] args) {
        Estudent objeto = new Estudent(); 
    
        Scanner leer= new Scanner(System.in);
        Hashtable <String,String> estudiante = new Hashtable <>();
    
        for (int i = 1; i <=5; i++) {
            System.out.println("Ingrese el N° de carnet del estudiante: "+i);
            objeto.setNcarnet(leer.nextDouble());
      
        System.out.println("Ingrese el nombre de su carrera:" +i);
        objeto.setNcarrera(leer.next());
        
        System.out.println("Ingrese el codigo de la carrera:" +i);
        objeto.setCodigoC(leer.nextDouble());
        }
        
    }
    
}


