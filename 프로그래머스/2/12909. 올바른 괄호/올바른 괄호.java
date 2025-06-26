import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<String> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            
            char ch = s.charAt(i);
            
            if(ch == '('){
                
                stack.add("(");
                
            }else if( !stack.isEmpty() && stack.peek() == "("){
                stack.pop();            
            }else{
                return false;
            }
            
        }


        return stack.isEmpty() ? true : false;
    }
}