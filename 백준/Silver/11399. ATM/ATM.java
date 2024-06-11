import java.util.*;


public class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int sum=0;

        int[] arr = new int[number];


        for(int i=0; i<number; i++){

            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);

        for(int i=0; i<number; i++){

            sum+=(arr[i]*(number-i));
        }
        System.out.println(sum);




    }
}