import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
        
        int D = (B+C)/60;
        int E = (B+C)%60;
        

        if(A+D>=24){
            System.out.println((A+D-24)+" "+E);
        }else{
            System.out.println(A+D+" "+E);
        }
        
        
        
 
		in.close();
	}
}
