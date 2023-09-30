package B4;



import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EjercicioJava {
    private static final Logger logger = Logger.getLogger(EjercicioJava.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        logger.setLevel(Level.INFO);

        try {
            FileHandler fileHandler = new FileHandler("log.txt");
            logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);

            int numero1, numero2, resultado;

            do {
                System.out.print("Ingresa el primer número: ");
                numero1 = scanner.nextInt();
                System.out.print("Ingresa el segundo número: ");
                numero2 = scanner.nextInt();

                try {
                    resultado = multiplicar(numero1, numero2);
                    logger.log(Level.INFO, "Resultado de la multiplicación: " + resultado);

                    if (resultado <= 100) {
                        logger.log(Level.INFO, "La multiplicación no supera 100. Ingresa números nuevamente.");
                    }
                } catch (ArithmeticException e) {
                    logger.log(Level.SEVERE, "Error: División por cero", e);
                    resultado = 0;
                }
            } while (resultado <= 100);

            System.out.println("La multiplicación es mayor que 100. Programa finalizado.");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error en el programa", e);
        } finally {
            scanner.close();
        }
    }

    public static int multiplicar(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero");
        }
        return a * b;
    }
}



