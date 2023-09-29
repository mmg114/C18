package B4;

public class Ciclos {

    public static void main(String[] args) {
        int contador = 5;

        // Ejemplo de while
        while (contador < 5) {
            System.out.println("Valor del contador (while): " + contador);
            contador++;
        }

        contador = 0;

        // Ejemplo de do-while
        do {
            System.out.println("Valor del contador (do-while): " + contador);
            contador++;
        } while (contador < 5);
    }
    }

