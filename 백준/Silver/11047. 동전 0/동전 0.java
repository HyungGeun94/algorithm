import java.util.*;


public class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int price = scanner.nextInt();
        int sum=0;

        int[] arr =new int[count];
        for(int i=0; i<count; i++){
            
            arr[i]=scanner.nextInt();
        }
        
        Arrays.sort(arr);
        
        for(int i=arr.length-1; i>=0; i--){
            
            if(price/arr[i]>=1){
                sum+=(price/arr[i]);
                price = price-(arr[i]*(price/arr[i]));

            }
            
            if(price==0){
                break;
            }
            
            
        }

        System.out.println(sum);

    }
}