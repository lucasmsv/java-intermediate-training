import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    // função 6 = inverter valores de um vetor
    protected static void inverterArray() {
        int[] vetor = { 0, 1, 2, 3, 4, 5, 6, 7 };
        System.out.print("Vetor original: ");
        for (int i=0; i<vetor.length; i++) {
            System.out.print("("+ vetor[i]+ ")");
        }
        System.out.print("\nVetor invertido: ");
        for (int i=vetor.length-1; i>=0; i--) {
            System.out.print("("+ vetor[i]+ ")");
        }
    }

    // função 5 = matriz de soma
    protected static void matrizSoma() {
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Linha "+ (i+1)+ " | Coluna "+ (j+1)+ ": ");
                int numero = scanner.nextInt();
                matriz[i][j] = numero;
            }
            System.out.println();
        }
        int total = 0;
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                total += matriz[i][j];
            }
        }
        System.out.println("Total valores da matriz: "+ total);
    }

    // função 4 = verificar se o número é primo
    protected static void verificarNumeroPrimo() {
        System.out.print("Número: ");
        int numero = scanner.nextInt();
        for (int i = 2; i <= numero; i++) {
            boolean isPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimo = false;
                    break;
                }
            }
            if (isPrimo) {
                System.out.println("Número \""+ i+ "\" é primo.");
            }
        }
    }

    // função 3 = contagem total de caracteres sem espaçamento
    protected static int contagemTotalCaracteres(String texto) {
        return texto.replace(" ", "").length();
    }

    // função 2 = contagem de vogais e consoantes
    protected static void contagemVogaisConsoantes() {
        char[] vogais = { 'a', 'e', 'i', 'o', 'u' };
        char[] consoantes = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z' };

        System.out.print("Texto: ");
        String texto = scanner.nextLine().toLowerCase();
        String textoAlterado = texto.replace(" ", "");

        int qtdVogais = 0;
        int qtdConsoantes = 0;

        for (int i = 0; i < textoAlterado.length(); i++) {
            for (int j = 0; j < vogais.length; j++) {
                if (textoAlterado.charAt(i) == vogais[j]) {
                    qtdVogais++;
                }
            }
            for (char c : consoantes) {
                if (textoAlterado.charAt(i) == c) {
                    qtdConsoantes++;
                }
            }
        }
        System.out.println("Quantidade de vogais: "+ qtdVogais);
        System.out.println("Quantidade de consoantes: "+ qtdConsoantes);
    }

    // função 1 = ordenar valores em uma lista sem métodos prontos
    protected static void ordenacaoVetor() {
        int[] vetor = { 5, 1, 19, 42, 3, 7, 15 };
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j+1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
        System.out.print("Vetor ordenado: ");
        for (Integer v : vetor) {
            System.out.printf("(%d)", v);
        }
    }

    public static void main(String[] args) {
        /*
            Inserir a função desejada
        */
    }
}
