import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine()); 

        for (int i = 0; i < number; i++) {
            String[] split = scanner.nextLine().split(" ");
            int repeatCount = Integer.parseInt(split[0]);
            String inputString = split[1]; 

            StringBuilder result = new StringBuilder(); 

            for (char c : inputString.toCharArray()) {
                for (int j = 0; j < repeatCount; j++) {
                    result.append(c);
                }
            }

            System.out.println(result.toString());
        }
    }
}
