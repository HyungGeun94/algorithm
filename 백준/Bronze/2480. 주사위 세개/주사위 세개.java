import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner scanner = new Scanner(System.in);
        
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
        
        if(A==B && B==C){
            System.out.println(10000+(A*1000));
        }
        else if((A==B &&B!=C) || (A==C && A!=B)|| (B==C && A!=B)){
            System.out.println(A-B ==0 ? 1000+(A*100) : B-C==0 ? 1000+(B*100) : 1000+(C*100));

        }
        else if(A!=B &&B!=C &&A!=C){
          int result = ( (A>B && A>C) ? A : B>A && B>C ? B : C );
            System.out.println(result*100);
            
        }
        
        
 
		scanner.close();
	}
}