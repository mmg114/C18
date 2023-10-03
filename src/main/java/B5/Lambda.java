package B5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lambda {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        /* numeros.stream()
                .filter(cadaNumero -> cadaNumero % 2 == 0)
                .collect(Collectors.toList()).forEach(System.out::println);
*/


        List<String> nombres = Arrays.asList("Alice", "Bob", "Charlie","ANTONELA");


        List<String> nombresEnMayusculas = nombres.stream()
                .map(nombre -> nombre.toUpperCase())
                .collect(Collectors.toList());

       /* nombres.stream()
                .filter(nombre -> nombre=="Charlie")
                .map(nombre-> nombre.toUpperCase())
                .forEach(System.out::println);*/




        List<Integer> numerosx = Arrays.asList(5, 2, 9, 1, 7);
        numerosx.stream().sorted().forEach(System.out::println);






    }



}
