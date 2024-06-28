import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        //1. Ordenação Personalizada: Implemente um algoritmo que ordene um array de objetos com base em um critério personalizado (por exemplo, ordem alfabética de strings ou ordenação numérica).

        // Definição do array de strings
        String[] lista = {"Pedro", "Douglas", "Thiago", "Dennys", "Neto", "Anajara"};

        // Ordenação usando sort
        Arrays.sort(lista);

        // Impressão do array ordenado
        System.out.println(Arrays.toString(lista));
    }
}