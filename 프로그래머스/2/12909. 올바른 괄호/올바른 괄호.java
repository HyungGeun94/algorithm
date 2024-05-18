import java.util.*;


class Solution {
    boolean solution(String s) {

        boolean answer = true;

        Stack<Character> stack = new Stack<>();

        try{

            for(int i=0; i<s.length(); i++){

                if(s.charAt(i)=='('){
                    stack.push(s.charAt(i));

                }
                else{
                    stack.pop();

                }
                


            }
        }catch (EmptyStackException e){
            answer = false;
        }
        
        if(stack.size()!=0){
            answer = false;
        }

        return answer;
    }
}