import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int size = in.nextInt();

        for(int i=0; i<size; i++){

            for (int j = 0; j <=i ; j++) {

                System.out.print("*");

            }
            System.out.println();






        }






        in.close();
    }
}