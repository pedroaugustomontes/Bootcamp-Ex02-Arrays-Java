public class Ex04 {
    public static void main(String[] args) {
    // 4. Pesquisa em Matriz: Implemente um método para pesquisar um elemento em uma matriz multidimensional e retorne sua posição ou um indicativo de não encontrado.
    // definindo uma matriz de inteiros
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // elemento a ser pesquisado
        int elemento = 5;

        // pesquisar o elemento na matriz
        int[] posicao = pesquisarElemento(matriz, elemento);

        // imprimir o resultado da pesquisa
        if (posicao != null) {
            System.out.println("Elemento " + elemento + " encontrado na posição: [" + posicao[0] + ", " + posicao[1] + "]");
        } else {
            System.out.println("Elemento " + elemento + " não encontrado na matriz.");
        }
    }

    public static int[] pesquisarElemento(int[][] matriz, int elemento) {
        // percorrer a matriz para encontrar o elemento
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == elemento) {
                    // Retornar a posição como um array de inteiros
                    return new int[]{i, j};
                }
            }
        }
        // retornar null se o elemento não for encontrado
        return null;
    }
}


