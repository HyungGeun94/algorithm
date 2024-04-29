import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int size = in.nextInt();

        StringBuilder str = new StringBuilder();
        for(int i = 0; i < size; i++) {

            for(int j = 0; j <= i; j++) {
                str.append("*");
            }

            System.out.printf("%" + size + "s%n", str.toString());
            str = new StringBuilder();

        }

        in.close();
    }
}
