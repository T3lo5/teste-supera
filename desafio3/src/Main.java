import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do array e o valor alvo (separados por espaço): ");
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Digite os elementos do array separados por espaço: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = countPairsWithDifference(arr, k);
        System.out.println("Número de pares com diferença igual a " + k + ": " + count);
    }

    private static int countPairsWithDifference(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int complement = num - k;
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }

            int complement2 = num + k;
            if (map.containsKey(complement2)) {
                count += map.get(complement2);
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}