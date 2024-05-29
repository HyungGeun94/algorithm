import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String N = scanner.nextLine();  
        
        
        String numbers = scanner.nextLine();
        
        int sum = 0;
        
        for (int k = 0; k < numbers.length(); k++) {
            sum += numbers.charAt(k) - '0';
        }
        
        System.out.println(sum);
        
        scanner.close();
    }
}
