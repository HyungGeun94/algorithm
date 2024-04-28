import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
        String answer = "";
        
        for(int i=0; i<A/4 ; i++){
            answer+="long ";
            
        }
		answer+="int";
 
        System.out.println(answer);
		in.close();
	}
}