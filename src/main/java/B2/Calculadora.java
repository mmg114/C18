package B2;


import java.util.Date;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {


      Scanner scanner = new Scanner(System.in);


      System.out.println(scanner);

      System.out.println("Digite el primer numero");
      int numero1 = scanner.nextInt();

      System.out.println("Digite el primer numero");
      int numero2 = scanner.nextInt();

        System.out.println("");

      sumar(numero2, numero1);
      restar(numero2, numero1);
      multi(numero2, numero1);
      divi(numero2, numero1);



    }

    private static void divi(int numero2, int numero1) {
        System.out.println("La Divicion es :"+(numero1/numero2));

    }

    private static void multi(int numero2, int numero1) {
        System.out.println("La Multiplicacion es :"+(numero1*numero2));
    }

    private static void restar(int numero2, int numero1) {
        System.out.println("La resta es :"+(numero1-numero2));
    }

    private static void sumar(int numero2, int numero1) {
        System.out.println("La Suma es :"+(numero1+numero2));
    }
}
