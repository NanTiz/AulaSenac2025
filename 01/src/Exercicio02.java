public class Exercicio02 {
    public static void main(String[] args) {
        int N = 5;
        for (int i = 5; i <= 1; --i) {
            int soma = N += i - 1;
            System.out.println(" Soma do N " + soma);
        }
    }
}