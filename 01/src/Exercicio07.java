public class Exercicio07 {
    public static void main(String[] args) {

                int N = 123;
                int soma = 0;

                for (int temp = N; temp > 0; temp /= 10) {
                    soma += temp % 10;
                }
                System.out.println("Soma dos dígitos: " + soma);
            }
        }