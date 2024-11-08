import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int c = Integer.parseInt(String.valueOf(A) + String.valueOf(B));

        System.out.println(A+B-C);
        System.out.println(c-C);

    }
}