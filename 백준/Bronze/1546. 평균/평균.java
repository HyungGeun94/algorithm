import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); 
        int[] scores = new int[N]; 

        for (int i = 0; i < N; i++) {
            scores[i] = scanner.nextInt();
        }

        int maxScore = scores[0];
        for (int i = 1; i < N; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }

        double sum = 0;
        for (int score : scores) {
            sum += (double) score / maxScore * 100;
        }
        double average = sum / N;

        System.out.printf("%.6f\n", average);

        scanner.close();
    }
}
