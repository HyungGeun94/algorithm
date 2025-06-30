class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for(int i=1; i<food.length; i++){
            
            if(food[i]/2>=1){
             answer+=String.valueOf(i).repeat(food[i]/2);
            }
            
            
        }
        answer+="0";
        
        for(int i=food.length-1; i>=0; i--){
            
             if(food[i]/2>=1){
             answer+=String.valueOf(i).repeat(food[i]/2);
            }
            
            
            
        }
        
        return answer;
    }
}