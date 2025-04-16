import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.println("Digite um número: ");
                int N = scanner.nextInt();

                boolean numeroP = true;

                if (N < 2) {
                    numeroP = false;
                } else {
                    for (int i = 2; i < N; i++) {
                        if (N % i == 0) {
                            numeroP = false;
                            break;
                        }
                    }
                }

                if (numeroP) {
                    System.out.println(N + " É primo ");
                } else {
                    System.out.println(N + " não é primo ");
                }

                scanner.close();
            }
        }