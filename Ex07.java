import java.util.Arrays;

public class Ex07 {
    public static void main(String[] args) {
        //7. Rotacionar um Array: Crie uma função para rotacionar os elementos de um array para a esquerda ou para a direita por um número específico de posições.
        int[] array = {1, 2, 3, 4, 5};
        // rotacionar para a esquerda por 2 posições
        int[] arrayRotacionadoEsquerda = rotacionar(array, 3, "esquerda");
        System.out.println("array rotacionado para a esquerda 3 posiçoes: " + Arrays.toString(arrayRotacionadoEsquerda));
        // rotacionar para a direita por 2 posições
        int[] arrayRotacionadoDireita = rotacionar(array, 3, "direita");
        System.out.println("array rotacionado para a direita em 3 posiçoes: " + Arrays.toString(arrayRotacionadoDireita));
    }

    public static int[] rotacionar(int[] array, int posicoes, String direcao) {
        int[] resultado = new int[array.length];
        int tamanho = array.length;

        // ajusta o número de posições para garantir que ele esteja no intervalo de 0 a tamanho-1
        posicoes = posicoes % tamanho;

        if (direcao.equals("esquerda")) {
            for (int i = 0; i < tamanho; i++) {
                resultado[i] = array[(i + posicoes) % tamanho];
            }
        } else if (direcao.equals("direita")) {
            for (int i = 0; i < tamanho; i++) {
                resultado[i] = array[(i - posicoes + tamanho) % tamanho];
            }
        }
        return resultado;
    }
}
