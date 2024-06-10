import java.util.*;


public class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        String ABC = (A*B*C)+"";

        char[] charArray = ABC.toCharArray();
        int[] intArray = new int[10];

        for (char c : charArray) {
            intArray[c - '0']+=1;
        }

        for (int i : intArray) {
            System.out.println(i);
        }


    }
}