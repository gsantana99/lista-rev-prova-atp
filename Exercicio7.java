import java.util.Scanner;

public class Exercicio7 {

    public static double calcMediaArit(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] vetorInput = input.split(" ");
        double soma = 0;
        for (int i = 0; i < vetorInput.length; i++){
            soma += Double.parseDouble(vetorInput[i]);
        }
        return (soma/(double) vetorInput.length);
    }

}
