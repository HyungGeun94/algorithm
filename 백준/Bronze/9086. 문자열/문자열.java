import java.math.BigInteger;
import java.util.*;


public class Main{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<count; i++){

            String str = scanner.nextLine();

            if(str.length()==1) {
                System.out.println(str+str);
            }else{
                System.out.println(""+str.charAt(0)+str.charAt(str.length()-1));
            }

        }


    }



}