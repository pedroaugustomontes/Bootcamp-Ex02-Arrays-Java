public class Ex09 {
    public static void main(String[] args) {
        //9. Subconjuntos de Soma Zero: Determine se existe um subconjunto não vazio de elementos em um array cuja soma seja igual a zero.
        int[] array = {3, 4, -7, 1, 3, 3, 1, -4};

        boolean existeSubconjunto = existeSubconjuntoSomaZero(array);

        if (existeSubconjunto) {
            System.out.println("Existe um subconjunto não vazio cuja soma é igual a zero.");
        } else {
            System.out.println("Não existe um subconjunto não vazio cuja soma é igual a zero.");
        }
    }

    public static boolean existeSubconjuntoSomaZero(int[] array) {
        int n = array.length;

        // verifica todas as possíveis somas de subconjuntos
        for (int i = 0; i < n; i++) {
            int soma = 0;
            for (int j = i; j < n; j++) {
                soma += array[j];
                if (soma == 0) {
                    return true; // subconjunto encontrado
                }
            }
        }
        return false; // subconjunto nao encontrado
    }
}
