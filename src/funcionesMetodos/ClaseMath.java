package funcionesMetodos;

public class ClaseMath{

    
    public ClaseMath( ){
        
        
        System.out.println(Math.PI);
        // Euler
        System.out.println(Math.E);
        // Elevado a la potencia
        System.out.println(Math.pow(4, 3));
        // Randon
        System.out.println(Math.random());
        // Convertir randon a entero
        int numeroRandon = (int)(Math.random()*101);
        System.out.println(numeroRandon);
        // Raiz cuadrada
        System.out.println(Math.sqrt(numeroRandon));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.sqrt(25));
        // Número mayor
        System.out.println(Math.max(1541, 9541));
        // Número menor
        System.out.println(Math.min(1541, 9541));
        // Redondeo
        System.out.println(Math.round(5.4));
        System.out.println(Math.round(5.5));
        System.out.println(Math.round(5.6));
        // Redondeado moneda
        double moneda1 = (double)Math.round(3.1144 * 100d)/100;
        double moneda2 = (double)Math.round(3.1154 * 100d)/100;
        System.out.println(moneda1);
        System.out.println(moneda2);
        
    }
    

   
    
    
}