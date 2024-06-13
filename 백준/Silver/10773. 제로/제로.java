import java.util.*;


public class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        int[] arr = new int[count];

        int sum = 0;

        for(int i=0,j=0; i<count; i++){

            int number =  scanner.nextInt();

            if(number==0){
                j--;
                sum-=arr[j];
                arr[j]=0;
            }else{
                arr[j]=number;
                sum+=number;
                j++;
            }

        }

        System.out.println(sum);






    }
}