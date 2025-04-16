import java.util.ArrayList;

public class Exercicio16 {
    public static void main(String[] args) {


                ArrayList<Integer> N = new ArrayList<>();
                N.add(1);
                N.add(2);
                N.add(3);
                N.add(4);
                N.add(5);
                N.add(6);
                N.add(7);
                N.add(8);
                N.add(9);
                N.add(10);

                int buscarNumero = 20;

                if (N.contains(buscarNumero)) {
                    System.out.println(" Número " + buscarNumero + " está na lista ");
                } else {
                    System.out.println(" Número " + buscarNumero + " não está na lista ");
                }
            }
        }