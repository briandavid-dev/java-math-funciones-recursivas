
import java.util.Scanner;

public class Main {
    
    public static void main(String [] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println(nombre);
        
        System.out.println("Ingrese F o M");
        char sexo = leer.next().charAt(0);
        System.out.println(sexo);
        
        

        
    }
    
}
