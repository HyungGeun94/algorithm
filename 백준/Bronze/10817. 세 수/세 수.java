import java.util.*;


public class Main{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int A =scanner.nextInt();
        int B =scanner.nextInt();
        int C =scanner.nextInt();

        int [] intArr = {A,B,C};

        Arrays.sort(intArr);

        System.out.println(intArr[1]);



    }
}