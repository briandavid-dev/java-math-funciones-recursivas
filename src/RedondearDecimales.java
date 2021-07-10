
import java.util.Scanner;

public class RedondearDecimales {
    
    public static void main(String [] args) {
        
        double cantidadMoneda = 1000;
        double valorDolar = 700;
        
        double dolares = cantidadMoneda / valorDolar;
        dolares = (double)Math.round(dolares * 100d) / 100;
        
        
        
        System.out.println(dolares);
        

        
    }
    
}
