package B2;

import java.util.Scanner;

public class EstructurasIFElse {

    public static void main(String[] args) {



       Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Digite su edad");
//        int edad = scanner.nextInt();
//
//
//        if ((edad >= 18) ) {
//            System.out.println("Eres mayor de edad.");
//        }else {
//            System.out.println("Eres menor de edad.");
//        }


        System.out.println("Digite una opcion");
        int opcion = scanner.nextInt();


        switch (opcion) {
            case 1:
                System.out.println("Seleccionaste la opción 1.");
                break;
            case 2:
                System.out.println("Seleccionaste la opción 2.");
                break;
            case 3:
                System.out.println("Seleccionaste la opción 3.");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }


    }
}
