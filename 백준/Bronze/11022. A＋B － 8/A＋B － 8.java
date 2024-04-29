import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
        
		Scanner in = new Scanner(System.in);
        
        int size = in.nextInt();
        
        for(int i=1; i<=size; i++){
            
        int A = in.nextInt();
        
		int B = in.nextInt();
            
            System.out.println("Case #"+i+": "+A+" + "+B+" = "+(A+B));
        
            
            
            
        }
        

        
        
        
 
		in.close();
	}
}