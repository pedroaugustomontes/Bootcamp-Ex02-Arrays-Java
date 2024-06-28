public class Ex10 {
    public static void main(String[] args) {
        //10. Palíndromos: Verifique se um array de strings contém palavras que são palíndromos (palavras que se leem da mesma forma de trás para frente).
        String[] palavras = {"ana", "civic", "palindromo", "radar", "level", "java"};

        for (String palavra : palavras) {
            if (ehPalindromo(palavra)) {
                System.out.println(palavra + " é um palíndromo.");
            } else {
                System.out.println(palavra + " não é um palíndromo.");
            }
        }
    }

    public static boolean ehPalindromo(String palavra) {
        int inicio = 0;
        int fim = palavra.length() - 1;

        while (inicio < fim) {
            if (palavra.charAt(inicio) != palavra.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }
        return true;
    }
}
