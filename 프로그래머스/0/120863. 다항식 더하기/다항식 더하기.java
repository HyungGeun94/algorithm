import java.util.*;

class Solution {
    public String solution(String polynomial) {
        
        int xcontainInt =0 ;
        int number = 0;
        
        String[] strArr = polynomial.split(" ");
        
        for(int i=0 ; i<strArr.length ; i++){
            
            if(strArr[i].contains("x")){
                System.out.println("first" + strArr[i]);

                if(strArr[i].length()==1){
                    xcontainInt+=1;
                }else{
                    strArr[i]= strArr[i].replace("x","");
                     System.out.println(strArr[i]);
                    xcontainInt+= Integer.parseInt(strArr[i]);

                }
                
                
            }else if(!strArr[i].equals("+")){
                number+= Integer.parseInt(strArr[i]);
            }
            
        }
        if (xcontainInt == 0) return number + "";
        if (number == 0) return (xcontainInt == 1 ? "x" : xcontainInt + "x");
        return (xcontainInt == 1 ? "x" : xcontainInt + "x") + " + " + number;
    }
}