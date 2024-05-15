import java.util.*;


class Solution {
    public int[] solution(int[] arr) {
        
        
      
        
        
        
        int[] answer = {};
        
        if(arr.length==1){
             answer = new int[]{-1};
        } else{
            
            answer= new int[arr.length-1];
    
        

        List<Integer> originList = new ArrayList<>();
        List<Integer> sortedList = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            originList.add(arr[i]);
            sortedList.add(arr[i]);
        }
        
        Collections.sort(sortedList);
        
        int min = sortedList.get(0);
        
        originList.remove(new Integer(min));
        
        for(int i=0; i<originList.size(); i++){
            answer[i]=originList.get(i);
        }
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
        return answer;
    }
}