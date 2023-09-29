package B4;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EjemploTryCatch {

    private static final Logger logger = Logger.getLogger(EjemploTryCatch.class.getName());
    public static void main(String[] args) {
        logger.setLevel(Level.INFO);
        String apellido="";

        Scanner scanner = new Scanner(System.in);
        try {
            if (apellido == null || apellido.isBlank()) {
                throw new Exception("Por favor llene el campo apellido");
            }
            logger.log(Level.INFO, "El apellido es : " + apellido);
        }catch (Exception e){
            logger.log(Level.SEVERE, "Error ", e);
        }finally {
            scanner.close();
        }

        System.out.println("La aplicacion Culmino con exito");
    }

}
