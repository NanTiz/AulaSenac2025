import java.util.ArrayList;
import java.util.Collections;

public class Exercicio20 {
    public static void main(String[] args) {

         ArrayList<Integer> N = new ArrayList<>();
                for (int i = 1; i <= 10; i++) {
                    N.add(i);
                }
                
                Collections.sort(N, Collections.reverseOrder());

                System.out.println(" Lista ordem decrescente: " + N);
            }
        }