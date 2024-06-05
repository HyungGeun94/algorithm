import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        Set<Integer> numbers = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            numbers.add(scanner.nextInt());
        }
        
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}
