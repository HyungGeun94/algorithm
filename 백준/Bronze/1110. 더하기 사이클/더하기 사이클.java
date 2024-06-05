import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int original = n;
        int count = 0;

        while (true) {
            count++;
            int sum = (n / 10) + (n % 10);
            n = ((n % 10) * 10) + (sum % 10);

            if (n == original) {
                break;
            }
        }

        System.out.println(count);
    }
}
