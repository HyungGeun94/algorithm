import java.util.*;

class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] stArr = binomial.split(" ");
        int a =Integer.parseInt(stArr[0]);
        String op = stArr[1];
        int b = Integer.parseInt(stArr[2]);
        
        if(op.equals("+")){
            answer=a+b;
        }else if(op.equals("-")){
            answer=a-b;
        }else{
            answer=a*b;
        }
        
    
        
        
        return answer;
    }
}