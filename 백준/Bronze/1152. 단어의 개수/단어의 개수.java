import java.util.*;

public class Main{
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        String str = scanner.nextLine().trim();
        

        
        if(str.isEmpty()){
        
            System.out.println(0);
        }
        else{
            
            String[] strArr = str.split(" ");

            
        
        System.out.println(strArr.length);
            
        }
        
    }
    
}