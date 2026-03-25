package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int a = sc.nextInt();

        System.out.println("Ingrese el segundo número:");
        int b = sc.nextInt();

          Suma suma = new Suma();
//       
//        Multiplicacion multiplicacion = new Multiplicacion();
//
       System.out.println("Suma: " + suma.suma(a, b));
//       
//        System.out.println("Multiplicación: " + multiplicacion.calcular(a, b));

    }
}
