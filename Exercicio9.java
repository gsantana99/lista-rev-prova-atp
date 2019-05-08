import java.util.Scanner;

public class Exercicio9 {

    public static void maiorEmenor() {
        System.out.println("Insira 5 números separados para que sejam determinados o maior e o menor: ");
        Scanner scanner = new Scanner(System.in);
        int maior = 0;
        int menor = 0;
        int num = 0;
        for (int i = 1; i <= 5; i++) {
            num = scanner.nextInt();
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }
        System.out.println("O maior número dentre os inseridos é " + maior + " e o menor é " + menor);
    }

}
