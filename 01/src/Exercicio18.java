import java.util.ArrayList;
import java.util.Collections;

public class Exercicio18 {
    public static void main(String[] args) {

                ArrayList<Integer> N = new ArrayList<>();
                N.add(1);
                N.add(2);
                N.add(3);
                N.add(-4);
                N.add(5);
                N.add(-6);
                N.add(7);
                N.add(8);
                N.add(9);
                N.add(10);

                N.removeIf(n -> n < 0);

                System.out.println(" Remover números negativos: " + N);
            }
        }