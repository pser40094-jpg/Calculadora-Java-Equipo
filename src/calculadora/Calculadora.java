package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero:");
        int a = sc.nextInt();

        System.out.println("Ingrese el segundo numero:");
        int b = sc.nextInt();

        Suma suma = new Suma();
       
        Multiplicacion multiplicacion = new Multiplicacion();
        
        Resta calcular = new Resta();
       System.out.println("Suma: " + suma.suma(a, b));
       
        System.out.println("Multiplicacion: " + multiplicacion.calcular(a, b));
        
        System.out.println("Resta: " + calcular.calcular(a,b));

    }
}
