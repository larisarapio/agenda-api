package desafiosLiveCoding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PalavraPalindromo {

    //Resolver um teste de logica sobre como verificar se uma palavra é um palíndromo sem usar soluções de linguagen
    //Osso, Ana, Radar, Renner, Roma é amor, 121, 4554, 378873, Sopapos.
    //Para considerar uma palavra ou frase como palíndromo, não se levam em conta acentos, cedilhas e pontuações.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = scanner.nextLine();

        char[] caract =  palavra.toCharArray();

        for (int i = 0; i < caract.length/2; i++) {
            char temp = caract[i]; //caract[i] continua com o valor
            caract[i] = caract[caract.length-1-i]; // era zerado e agora ficou com a valor da posição x

            caract[caract.length-1-i] = temp;
        }

        String palavraInvertida = new String(caract);
        if(palavra.equals(palavraInvertida)){
            System.out.println("são iguais");
        }else {
            System.out.println("não são iguais");
        }


        //String palavraInvertida = new StringBuilder(palavra).reverse().toString();
        System.out.println(palavraInvertida);

        int x = 2;
        int y = x;
        x = 5;
        System.out.println("valr de x = " + x + " e y = " + y);



        String anagrama = "listen";
        List<String> caracteres = Arrays.asList(anagrama.split(""));
        Collections.shuffle(caracteres);

        String palavraAnagrama = String.join(" ", caracteres);
        System.out.println("Anagrama gerado: " + palavraAnagrama);

        String entrada = "abracadabra";






    }
}
