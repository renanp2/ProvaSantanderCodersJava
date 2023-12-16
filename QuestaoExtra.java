import java.util.Scanner;

public class QuestaoExtra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número inteiro para criar seu triângulo");
        int valor = input.nextInt();
        if(valor < 0){
            System.out.println("valor inválido, é necessário um valor inteiro");
        }else {
            // primeira piramide
            for (int i = 0; i < valor; i++) {
                for (int j = 0; j < valor - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            // segunda piramide
            for (int x = valor - 1; x > 0; x--) {
                for (int y = 0; y < valor - x; y++) {
                    System.out.print(" ");
                }

                for (int y = 0; y < 2 * x - 1; y++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
        input.close();
    }
}
