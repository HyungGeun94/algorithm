import java.util.*;


class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] strArr = my_string.split(" ");
        
        Stack stack = new Stack();
        
        for(int i=0; i<strArr.length; i++){
            
            if(stack.isEmpty()){
                answer+=Integer.parseInt(strArr[i]);
            }else if(stack.peek().equals("-")){
                answer-=Integer.parseInt(strArr[i]);
            }else if(stack.peek().equals("+")){
                answer+=Integer.parseInt(strArr[i]);
            }                
            stack.add(strArr[i]);

            
        }
        
        
        return answer;
    }
}