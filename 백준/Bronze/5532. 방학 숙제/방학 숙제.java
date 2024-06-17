import java.util.*;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int day = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();


        int korea = A%C==0 ? A/C : (A/C)+1;
        int math = B%D==0 ? B/D : (B/D)+1;


        System.out.println(day - Math.max(korea,math));

    }

}



