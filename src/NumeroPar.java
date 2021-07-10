import funcionesMetodos.*;
import java.util.Scanner;
import prueba1.OtraClase2;
import prueba1.OtraClase3;

public class NumeroPar {
 
    public static void main(String [] args) {
        
        // init("Escriba algún número: ");
        
        // NumeroPar numeroPar = new NumeroPar();
        // numeroPar.metodo1(2);
        
        // Funciones dfun1 = new Funciones("Mafer");
        // Funciones dfun2 = new Funciones("Brian");
        
        // FuncionesRecursivas fr = new FuncionesRecursivas(11);
        
        // ClaseMath cm = new ClaseMath();
        
        ClaseString cm = new ClaseString();

        
    }
    
    public static void init(String titulo) {
    
        Scanner input = new Scanner(System.in);
        System.out.print(titulo);
        int numero = input.nextInt();
        String definicion;
        
        if(numero == 0) {
            definicion = " Es Neutro";
        } else if(numero % 2 == 0) {
            definicion = " Es par";
        } else {
            definicion = " Es impar";
        } 
        
        if(numero > 0) {
            definicion += " y positivo";
        } else {
            definicion += " y negativo";
        }
        
        OtraClase otraClase = new OtraClase();
        int numero2 = otraClase.devuelveNumero(1);
        
        OtraClase2 otraClase2 = new OtraClase2();
        String nombre = otraClase2.nombre("David 3");
                
        OtraClase3 otraClase3 = new OtraClase3();
        String apellido = otraClase3.apellido("Ochoa 4");
        
        
        
        
                
        
        System.out.printf("%s %s. "
                + "\nOtraClase devuelveNumero %s "
                + "\nOtraClase2 nombre %s "
                + "\nOtraClase3 apellido %s "
                + "\n",numero, definicion, numero2, nombre, apellido);
        
    }
    
    public void metodo1(int nmero){
        System.out.println("Metodo "+nmero);
        
        // Definición de arrays 
        
        String[] nombres = new String[3];
        nombres[0] = "Brian 1";
        nombres[1] = "David";
        nombres[2] = "Fernanda";
        for(int n = 0; n < nombres.length; n++){
            System.out.println(nombres[n]);
        }
        
        int edades[];
        edades = new int[4];
        edades[0] = 10;
        edades[1] = 20;
        edades[2] = 30;
        edades[3] = 40;
        for(int n = 0; n < edades.length; n++){
            System.out.println(edades[n]);
        }
        
        int[] edades2 = {11,12};
        for(int n = 0; n < edades2.length; n++){
            System.out.println(edades2[n]);
        }
        for(int edad: edades2){
            System.out.println(edad);
        }


        
    }

}