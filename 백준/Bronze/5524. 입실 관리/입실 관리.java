import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        scanner.nextLine();

        for(int i=0; i<count; i++){

            System.out.println(scanner.nextLine().toLowerCase());

        }


    }
}