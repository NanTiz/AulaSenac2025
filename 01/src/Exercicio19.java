import java.util.ArrayList;
import java.util.Collections;

public class Exercicio19 {
    public static void main(String[] args) {

                ArrayList<Integer> N = new ArrayList<>();
                for (int i = 1; i <= 10; i++) {
                    N.add(i);
                }

                Collections.sort(N);

                System.out.println(" Lista ordem crescente: " + N);
            }
        }