import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        for(int i=1; i<=size; i++){

            int A = scanner.nextInt();
            int B = scanner.nextInt();

            System.out.println("Case #"+i+": "+A+" + "+B+" = " +(A+B));

        }
    }

}