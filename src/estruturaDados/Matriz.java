package estruturaDados;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Matriz {
    public static void main(String[] args) {

        /*
        int [] numeros = {1, 2, 3, 4, 4};
        System.out.println(Arrays.toString(numeros.clone()));
        int sum = Arrays.stream(numeros).reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        List<String> nomes = Arrays.asList("-Ana", "João", "Maria", "-ana");

        nomes.stream()
                .distinct()
                .forEach(System.out::println);

        List<String> nomes1 = Arrays.asList("Titião", "Robson", "José");

        nomes1.stream()
                .filter(name -> name.startsWith("Robson"))
                .forEach(System.out::println);

        List<String> frutas = Arrays.asList("maça", "banana", "uva");

        frutas.stream()
                .map(name -> name.toUpperCase())
                .forEach(System.out::println);

        List<String> fruta1 = Arrays.asList("3maça", "2banana", "9uva");

        fruta1.stream()
                .sorted()
                .forEach(System.out::println);

        */

        // soma
        int [] soma = {1, 2, 3, 4};
        int total = Arrays.stream(soma).reduce(0, (a,b) -> a + b);
        System.out.println(total);

        // menor numero
        int [] menorMaiorNumero = {5, 3, 7, 1, 9};
        int maior = Arrays.stream(menorMaiorNumero).max().getAsInt();
        int menor = Arrays.stream(menorMaiorNumero).min().getAsInt();
        System.out.println(maior + " maior e maior " + menor);

        //inverte
        Integer[] numeros = {1, 2, 3, 4, 5};
        List<Integer> listaInvertida = Arrays.stream(numeros)
                .collect(Collectors.toList());

        Collections.reverse(listaInvertida);

        System.out.println("invertindo:" + listaInvertida);

    }
}
