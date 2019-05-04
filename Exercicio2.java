public class Exercicio2 {

    public static int converte_segundos(int h, int m, int s){
        int h_seg = h * 60 * 60;
        int m_seg = m * 60;
        return h_seg + m_seg + s;
    }

}
