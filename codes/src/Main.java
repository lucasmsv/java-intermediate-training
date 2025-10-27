import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    // função 6 = verifica o maior e o menor número
    protected static void verificarMaiorMenor() {
        System.out.print("Quantidade de números: ");
        int qtdNumeros = scanner.nextInt();
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < qtdNumeros; i++) {
            System.out.print("Número "+ (i+1)+ ": ");
            int numero = scanner.nextInt();
            if (numero >= maior) {
                maior = numero;
            }
            if (numero <= menor) {
                menor = numero;
            }
        }
        System.out.println("Maior: "+ maior);
        System.out.println("Menor: "+ menor);
    }

    // função 5 = calcular o fatorial de um número
    protected static void calcularFatorial(int numero) {
        int aux = 1;
        for (int i = 1; i <= numero; i++) {
            aux *= i;
        }
        System.out.println("Fatorial de \""+ numero+ "\" é \""+ aux+ "\".");
    }

    // função 4 = verificar se palavra é palíndromo
    protected static String verificarPalindromo(String palavra) {
        for (int i = 0, j = palavra.length() - 1; i < j; i++, j--) {
            if (palavra.toLowerCase().charAt(i) != palavra.toLowerCase().charAt(j)) {
                return "Palavra \""+ palavra+ "\" não é um palíndromo.";
            }
        }
        return "Palavra \""+ palavra+ "\" é um palíndromo.";
    }

    // função 3 = gerar a tabuada do número informado
    protected static void gerarTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero+ " x "+ i+ " = "+ (numero*i));
        }
    }

    // função 2 = somar todos os números inseridos
    protected static void somarNumerosInseridos() {
        System.out.print("Quantidade de números: ");
        int qtdNumeros = scanner.nextInt();
        int total = 0;
        for (int i = 0; i < qtdNumeros; i++) {
            System.out.print("Número "+ (i+1)+ ": ");
            int numero = scanner.nextInt();
            total += numero;
        }
        System.out.println("Total: "+ total);
    }

    // função 1 = verificar se é par ou ímpar
    protected static String verificarParidade(int numero) {
        return numero % 2 == 0 ? "Par" : "Ímpar";
    }

    public static void main(String[] args) {
        /*
            Inserir a função desejada
        */
    }
}
