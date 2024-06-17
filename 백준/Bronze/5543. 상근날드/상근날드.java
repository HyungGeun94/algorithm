import java.util.*;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int E = scanner.nextInt();

        int minHam = Math.min(Math.min(A, B), C);
        int minBev = Math.min(D,E);

        System.out.println((minHam+minBev)-50);


    }

}
