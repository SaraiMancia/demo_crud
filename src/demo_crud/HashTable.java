package demo_crud;

import java.util.Hashtable;
import java.util.Scanner;


public class HashTable {
    public static void main(String[] args) {
<<<<<<< HEAD
        
=======
        estudiante objeto = new estudiante(); 
>>>>>>> 573879f8682d6b30be37982348e207eb8b596069
    
        Scanner leer= new Scanner(System.in);
         estudiante objeto = new estudiante();
        Hashtable <String,String> Estudiante = new Hashtable <String,String>();
    
        for (int i = 1; i <=5; i++) {
            System.out.println("Ingrese el N° de carnet del estudiante: "+i);
            objeto.setNcarnet(leer.nextDouble());
      
        System.out.println("Ingrese el nombre de su carrera:" +i);
        objeto.setNcarrera(leer.next());
        
        System.out.println("Ingrese el codigo de la carrera:" +i);
        objeto.setCodigoC(leer.nextDouble());
    }
        
        for (int i= 1; i<=5; i++) {
        System.out.println("El numero de carnet del estudiante es: "+objeto.getNcarnet());
        System.out.println("El nombre de la carrera de el estudiante es: " +objeto.getNcarrera());
        System.out.println("El codigo del estudiante es: " +objeto.getCodigoC());
        Estudiante.put("a" +i,String.valueOf(Estudiante));
        
    }
    
}
}