package funcionesMetodos;

public class FuncionesRecursivas{

    
    public FuncionesRecursivas(int total ){
        
     System.out.println("FuncionesRecursivas"); 
       cuentaRegresiva(total);
        
    }       
    
    static void cuentaRegresiva(int numero){
        numero--;
        if(numero > 0){
            System.out.println(numero);
            cuentaRegresiva(numero);
        } else {
            System.out.println("Llegó hasta "+numero);

        }
        
    
    }
    
    
       
        
        
 
    
    
}