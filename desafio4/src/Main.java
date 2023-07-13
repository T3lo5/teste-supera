import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de casos de teste: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite a palavra a ser decifrada: ");
            String line = sc.nextLine();
            String unscrambledLine = unscrambleLine(line);
            System.out.println("Palavra decifrada: " + unscrambledLine);
        }
    }

    private static String unscrambleLine(String line) {
        int length = line.length();
        int middle = length / 2;
        StringBuilder sb = new StringBuilder(length);

        for (int i = middle - 1; i >= 0; i--) {
            sb.append(line.charAt(i));
        }

        for (int i = length - 1; i >= middle; i--) {
            sb.append(line.charAt(i));
        }

        return sb.toString();
    }
}