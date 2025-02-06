package estruturaDados;

import java.util.ArrayList;
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
           */

        //aqui ele coloca na ordem por numeros e por letras
        List<String> fruta1 = Arrays.asList("maça", "banana", "uva");

        fruta1.stream()
                .sorted()
                .forEach(System.out::println);



        //em colletions não faz isso, faz apenas cm numeros - integer
        List<String> fruta2 = Arrays.asList("20maça", "2banana", "9uva");
        Collections.sort(fruta2);
        System.out.println(fruta2);

        // soma
        int [] soma = {1, 2, 3, 4};
        int total = Arrays.stream(soma).reduce(0, (a,b) -> a + b);
        System.out.println(total);

        // menor numero
        int [] menorMaiorNumero = {5, 3, 7, 1, 9};
        int maior = Arrays.stream(menorMaiorNumero).max().getAsInt();
        int menor = Arrays.stream(menorMaiorNumero).min().getAsInt();
        System.out.println(maior + " maior e maior " + menor);

        //ou usar collections - aqui parece ser mais otimizado
        List<Integer> menorMaiorNumero1 = Arrays.asList(5, 1, 8, 3);
        System.out.println(Collections.min(menorMaiorNumero1)); // 1
        System.out.println(Collections.max(menorMaiorNumero1)); // 8

        //inverte
        Integer[] numeros = {1, 2, 3, 4, 5};
        List<Integer> listaInvertida = Arrays.stream(numeros)
                .collect(Collectors.toList());

        Collections.reverse(listaInvertida);

        System.out.println("invertindo:" + listaInvertida);


        //outra forma - daria para fazer com strings tb
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Collections.reverse(numbers);
        System.out.println("outra forma de reverter: " + numbers);

        // busca
        /*

        A ordenação padrão no Java diferencia maiúsculas de minúsculas:

        "Verde" (com V maiúsculo) vem antes de "azul" e "rosa".
        "verde" (com v minúsculo) vem depois de todas as strings com inicial maiúscula.
        Para ignorar maiúsculas/minúsculas, você pode usar um comparador personalizado:
            Collections.sort(cores, String.CASE_INSENSITIVE_ORDER);
         */
        List<String> cores = Arrays.asList("rosa", "azul", "verde");
        int posicao = Collections.binarySearch(cores, "verde");
        System.out.println(posicao);

        //Imutabilidade de coleções
        // a "lista" permite modificações
        List<String> lista = new ArrayList<>(Arrays.asList("A", "B", "C"));
        // não permite nenhuma modificação.
        List<String> listaImutavel = Collections.unmodifiableList(lista);

        System.out.println(listaImutavel);

    }
}
