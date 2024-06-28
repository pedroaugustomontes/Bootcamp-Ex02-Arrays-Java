import java.util.ArrayList;
import java.util.List;

public class Ex06 {
    public static void main(String[] args) {
        //6. Maior Sequência Crescente: Encontre a maior sequência crescente de números em um array e imprima os números dessa sequência.
        int[] array = {1, 2, 2, 3, 4, 1, 7, 8, 9};

        List<Integer> maiorSequencia = encontrarMaiorSequenciaCrescente(array);

        System.out.println("Maior sequência crescente: " + maiorSequencia);
    }

    public static List<Integer> encontrarMaiorSequenciaCrescente(int[] array) {
        //inicialização
        List<Integer> maiorSequencia = new ArrayList<>();
        List<Integer> sequenciaAtual = new ArrayList<>();

        //percorrer o array
        for (int i = 0; i < array.length; i++) {
            if (i == 0 || array[i] > array[i - 1]) {
                sequenciaAtual.add(array[i]);
            } else {
                if (sequenciaAtual.size() > maiorSequencia.size()) {
                    maiorSequencia = new ArrayList<>(sequenciaAtual);
                }
                sequenciaAtual.clear();
                sequenciaAtual.add(array[i]);
            }
        }
        // verificação final para o ultimo crescente
        if (sequenciaAtual.size() > maiorSequencia.size()) {
            maiorSequencia = sequenciaAtual;
        }

        return maiorSequencia;
    }
}
