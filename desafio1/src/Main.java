import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linhas (1 < n <= 10^5): ");
        int n = sc.nextInt();

        if (n < 1 || n > Math.pow(10, 5)) {
            System.out.println("O número de linhas está fora do intervalo válido.");
            return;
        }

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        System.out.println("Digite os números:");

        for (int i = 0; i < n; i++) {
            int valor = sc.nextInt();
            if (valor % 2 == 0) {
                pares.add(valor);
            } else {
                impares.add(valor);
            }
        }

        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());

        System.out.println("Números ordenados:");

        for (int par : pares) {
            System.out.println(par);
        }

        for (int impar : impares) {
            System.out.println(impar);
        }
    }
}