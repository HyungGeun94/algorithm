import java.util.*;


public class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        StringBuffer sb = new StringBuffer();
        for(int i=0; i<s.length(); i++){

            if(s.charAt(i)>='a' && s.charAt(i)<='z'){

                sb.append((s.charAt(i) + "").toUpperCase());
            }else{
                sb.append((s.charAt(i) + "").toLowerCase());
            }
        }

        System.out.println(sb.toString());



    }
}