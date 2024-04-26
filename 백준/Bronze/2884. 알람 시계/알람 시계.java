import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
        
        if(B>=45){
            B-=45;
            System.out.println(A+" "+B);
        }else if(A==0){
            System.out.println(23+" "+(15+B));
        }else{
            System.out.println((A-1)+" "+(15+B));
        }

		
 
		in.close();
	}
}