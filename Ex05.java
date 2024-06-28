import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex05 {
    public static void main(String[] args) {
        //5. Operações de Conjunto: Escreva funções que realizem operações de união, interseção e diferença entre dois arrays.
        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {4, 5, 6, 7, 8};

        // operações de conjunto
        List<Integer> uniao = uniao(array1, array2);
        List<Integer> intersecao = intersecao(array1, array2);
        List<Integer> diferenca = diferenca(array1, array2);

        // imprimir os resultados
        System.out.println("União: " + uniao);
        System.out.println("Interseção: " + intersecao);
        System.out.println("Diferença (array1 - array2): " + diferenca);
    }

    // metodo para realizar a união de dois arrays
    public static List<Integer> uniao(Integer[] array1, Integer[] array2) {
        List<Integer> resultado = new ArrayList<>(Arrays.asList(array1));
        for (Integer elemento : array2) {
            if (!resultado.contains(elemento)) {
                resultado.add(elemento);
            }
        }
        return resultado;
    }

    // metodo para realizar a interseção de dois arrays
    public static List<Integer> intersecao(Integer[] array1, Integer[] array2) {
        List<Integer> resultado = new ArrayList<>();
        List<Integer> lista2 = Arrays.asList(array2);
        for (Integer elemento : array1) {
            if (lista2.contains(elemento)) {
                resultado.add(elemento);
            }
        }
        return resultado;
    }

    // metodo para realizar a diferença de dois arrays (array1 - array2)
    public static List<Integer> diferenca(Integer[] array1, Integer[] array2) {
        List<Integer> resultado = new ArrayList<>(Arrays.asList(array1));
        for (Integer elemento : array2) {
            resultado.remove(elemento);
        }
        return resultado;
    }
}