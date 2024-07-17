import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for(int i=0; i<number; i++){

            int A = scanner.nextInt();
            int B = scanner.nextInt();
            System.out.println(A+B);

        }


    }
}