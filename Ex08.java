import java.util.Arrays;

public class Ex08 {
    public static void main(String[] args) {
        //8. Histograma de Frequência: Construa um histograma de frequência a partir de um array de números, mostrando quantas vezes cada número aparece.
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] frequencia = obterrequencia(array);
        System.out.println(Arrays.toString(frequencia));
    }

    public static int[] obterrequencia(int[] array) {
        int[] frequencia = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            frequencia[array[i] - 1]++;
        }
        return frequencia;
    }
}