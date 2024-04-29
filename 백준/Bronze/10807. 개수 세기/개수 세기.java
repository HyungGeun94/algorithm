import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
        
		Scanner in = new Scanner(System.in);
        
        int size = in.nextInt();
        
        int count = 0;
        
        
        int[] arr = new int[size];
 
        for(int i=0; i< arr.length ; i++){
        
		arr[i] = in.nextInt();        
        
       
        }
        
        int num = in.nextInt();
        
        for(int i=0; i<arr.length ; i++){
            if(arr[i]==num){
                count++;
            }
        }
        
        System.out.println(count);
        
 
		in.close();
	}
}