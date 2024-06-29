import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] split = scanner.nextLine().split(" ");


        int A = Integer.parseInt(split[0]);
        int B = Integer.parseInt(split[1]);
        int C = Integer.parseInt(split[2]);


        System.out.println(Math.max((int)((double)A*B/C),(int)((double)A/B*C)));



    }
}