package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);


            System.out.println("--------------------> CALCULADORA <--------------------");
            System.out.println();
            System.out.println("----> Ingresar solo numeros enteros...");
            System.out.println();
        
            System.out.println("Ingrese el primer numero:");
            int a = sc.nextInt();

            System.out.println("Ingrese el segundo numero:");
            int b = sc.nextInt();

            Suma suma = new Suma();
       
            Multiplicacion multiplicacion = new Multiplicacion();
        
            Resta resta = new Resta();
        
            System.out.println("--------------------> RESULTADOS <---------------------");
            
            System.out.println();
            System.out.println("Resultado de la suma: " + suma.suma(a, b));
            
            System.out.println();
            System.out.println("Resultado de la resta: " + resta.calcular(a,b));
            
            System.out.println();
            System.out.println("Resultado de la multiplicacion: " + multiplicacion.calcular(a, b));
        
    }
}
