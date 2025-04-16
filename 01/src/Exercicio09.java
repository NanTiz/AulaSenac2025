import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

                int N1 = 0, N2 = 1, proximoTermo;

                System.out.print(" Sequência Fibonacci: ");

                System.out.println(N1 + " " + N2 + " ");

                proximoTermo = N1 + N2;
                while (proximoTermo <= 21) {
                    System.out.println(proximoTermo + " ");
                    N1 = N2;
                    N2 = proximoTermo;
                    proximoTermo = N1 + N2;
                }
            }
        }