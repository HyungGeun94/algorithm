import java.util.*;


public class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int price = 1000 -scanner.nextInt();
        int[] money = {500, 100, 50, 10, 5, 1};
        int count =0;

        for (int i = 0; i < money.length; i++) {

            count+=(price/money[i]);
            price%=money[i];

        }

        System.out.println(count);


    }
}