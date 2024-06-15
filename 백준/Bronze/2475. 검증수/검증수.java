import java.util.*;


public class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int sum=0;
        for(int i=0; i<5; i++){
            int A = scanner.nextInt();
            sum+=(A*A);

        }

        System.out.println(sum%10);



    }
}