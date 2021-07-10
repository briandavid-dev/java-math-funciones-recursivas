package funcionesMetodos;

public class Funciones{

    private static String nombre;
    
    public Funciones( String nombre){
        
        this.nombre = nombre;
        
        
        // Bienvenida
        String bienvenida = this.darBienvenida("Bienvenido "+this.nombre);
        System.out.println(bienvenida);
        
        // Saludar
        saludar("Hi "+this.nombre);
        
        // Despedir
        this.despedir("Bye "+this.nombre);
        
       
        
        
       
        
        
    }
    

    // Definición de una función (se coloca static)
    static void saludar(String nombre){
        System.out.println(nombre);
    }
    
    public void despedir(String nombre){
        System.out.println(nombre);
    }
    
    static String darBienvenida(String nombre){
        return nombre;
    }
    
    
}