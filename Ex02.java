import java.util.Arrays;
public class Ex02 {
    public static void main(String[] args) {
        //2. Fusão de Arrays: Crie um método que receba dois arrays de inteiros ordenados e os funda em um único array ordenado
        //Scanner entradaUsuario = new Scanner(System.in);
        int[] inicial = {1, 5, 4, 3, 2};
        int[] novo = {8, 6, 84};
        // Ordena os arrays antes de mesclá-los
        Arrays.sort(inicial);
        Arrays.sort(novo);
        int[] atualizado = mesclarArraysOrdenados(inicial, novo);
        System.out.println(Arrays.toString(atualizado));
    }
    public static int[] mesclarArraysOrdenados(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;

        // Percorre ambos os arrays até que um deles seja completamente percorrido
        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                result[k++] = array1[i++];
            } else {
                result[k++] = array2[j++];
            }
        }
        while (i < array1.length) {
            result[k++] = array1[i++];
        }
        while (j < array2.length) {
            result[k++] = array2[j++];
        }
        return result;
    }
}