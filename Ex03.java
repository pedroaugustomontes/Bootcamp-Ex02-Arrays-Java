public class Ex03 {
    public static void main(String[] args) {
        //3. Média e Desvio Padrão: Escreva um programa que calcule a média e o desvio padrão de um array de números inteiros ou de ponto flutuante.
        int[] numeros = {10, 20, 25, 70, 99};
        double soma = 0;

        // Calculando a soma dos elementos do array
        for(double numero : numeros) {
            soma += numero;
        }
        // Calculando a média
        double media = soma / numeros.length;

        // Calculando o desvio padrão
        double quadradoSoma = 0;

        for(double numero : numeros) {
            quadradoSoma += Math.pow(numero - media, 2);
        }

        double desvioPadrao = Math.sqrt(quadradoSoma / numeros.length);
        // Imprimindo os resultados
        System.out.printf("Média: %.1f%n", media);
        System.out.printf("Desvio Padrão: %.1f%n", desvioPadrao);
    }
}
