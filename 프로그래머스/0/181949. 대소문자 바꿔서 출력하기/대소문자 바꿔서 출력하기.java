import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<a.length(); i++){
            
            char ch = a.charAt(i);
            
            if(ch>='a' && ch<='z'){
                
                sb.append(Character.toUpperCase(ch));
            
            }else{
                
                sb.append(Character.toLowerCase(ch));
                
            }
            
            
        }
        
        System.out.println(sb.toString());
        
    }
}