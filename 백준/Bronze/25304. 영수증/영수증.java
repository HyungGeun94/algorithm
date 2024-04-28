import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		int othersum = in.nextInt();
        int mysum = 0;
		int variety = in.nextInt();
        
        for(int i=0; i<variety; i++){
            int price = in.nextInt();
            int count = in.nextInt();
            mysum+= price*count;
            
        }
        
        
		
		System.out.println(mysum==othersum ? "Yes" : "No");
 
		in.close();
	}
}