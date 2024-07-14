import java.util.*;

class Solution {
    public int[] solution(String myString) {
        
        List<Integer> list = new ArrayList<>();
        int count =0;

        
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i)=='x'){
                
                list.add(count);
                count=0;
                
            }else{
                count++;
                
            }
            
        }
        
        if(count>0){
            list.add(count);
        }
        
        if(myString.charAt(myString.length()-1)=='x'){
            list.add(0);
            
        }
        
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++){
           
            answer[i]=list.get(i);
            
        }
        
        return answer;
    }
}