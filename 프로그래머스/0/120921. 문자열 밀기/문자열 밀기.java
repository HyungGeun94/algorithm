import java.util.*;


class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        if(A.equals(B)){
            return answer;
        }
        
        StringBuffer sbA = new StringBuffer(A);
  
        
        
        for(int i=0; i<A.length();i++){
            
            sbA.insert(0,A.charAt(A.length()-1));
            sbA.deleteCharAt(A.length());
            A=sbA.toString();
            if(A.equals(B)){
                answer=i+1;
                break;
            }else{
                answer=-1;
            }
        }
        

        
        
        
        
        
        
            
        
        
        return answer;
    }
}