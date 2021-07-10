package funcionesMetodos;

public class ClaseString {
    public ClaseString() {
        System.out.println("ClaseString");
        
        String nombre = "Brian";
        for(int n = 0; n < nombre.length(); n++){
            System.out.println(nombre.charAt(n));
        }
        
        System.out.println(nombre.substring(0,3));
        System.out.println(nombre.substring(0,4).toLowerCase());
        System.out.println(nombre.substring(0,5).toUpperCase());
        
        for(int n = 0; n <= nombre.length(); n++){
            System.out.println(nombre.substring(0,n));
        }
        
        System.out.println("\n");
        nombre = "D a v i d";
        System.out.println(nombre.replace(" ", "-"));
        System.out.println("\n");
        
        System.out.println("Hola" == "Hola");
        System.out.println("Hola".equals("Hola"));
        
        StringBuilder glosa = new StringBuilder();
        glosa.append("Hola ");
        glosa.append("Bebe.");
        System.out.println(glosa);

                
        
    }
}
