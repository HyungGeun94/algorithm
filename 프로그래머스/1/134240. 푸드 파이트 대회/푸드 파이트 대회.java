import java.util.*;


class Solution {
    public String solution(int[] food) {
        
        List<Integer> list = new ArrayList<>();
        
        
        for(int i=1; i<food.length; i++){
            
            if(food[i]>=2){
                for(int j=0; j<food[i]/2 ; j++){
                list.add(i);
                }
            }
            
        }
        list.add(0);
        for(int i=food.length-1; i>=1; i--){
            
            if(food[i]>=2){
                for(int j=0; j<food[i]/2 ; j++){
                list.add(i);
                }
            }
            
        }
        
        
        String answer = "";
        
        
        for(int i=0; i<list.size();i++){
            
            answer+=list.get(i);
            
        }
        
        
        
        return answer;
    }
}