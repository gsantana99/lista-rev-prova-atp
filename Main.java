import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, n_horas, n_minutos, n_segundos;
        

        System.out.print("Insira um número para que todos os termos entre 1 e ele sejam somados: ");
        n = scanner.nextInt();
        int soma_ate_n = Exercicio1.soma_ate_n(n);
        System.out.print("Resultado da soma: " + soma_ate_n);

        System.out.print("\n\nInsira um número de horas para ser convertido em segundos: ");
        n_horas = scanner.nextInt();
        System.out.print("Insira um número de minutos para ser convertido em segundos: ");
        n_minutos = scanner.nextInt();
        System.out.print("Insira um número de segundos: ");
        n_segundos = scanner.nextInt();
        int t_segundos = Exercicio2.converte_segundos(n_horas, n_minutos, n_segundos);
        System.out.println("Resultado da soma (H + M + S) em segundos: " + t_segundos);

        int resultado_cstr = Exercicio3.compara_strings("bbb", "bbc");
        //double vol_esfera = Exercicio4;
        String sinal_num = Exercicio5.ehPositivo(-8) ? "é positivo" : "é negativo";
        System.out.println(sinal_num);
       /*  = Exercicio6;
         = Exercicio7;
         = Exercicio9;
         = Exercicio10;
         = Exercicio21;
         = Exercicio24;*/
    }

}
