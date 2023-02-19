
public class Testalaco2 {
    public static void main(String[] args) {
        for(int linha = 0; linha < 10; linha++) {//laço externo uma vez
            for(int coluna = 0; coluna < 10; coluna++) {//laço interno dez vezes
                if(coluna > linha) {
                    break;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
