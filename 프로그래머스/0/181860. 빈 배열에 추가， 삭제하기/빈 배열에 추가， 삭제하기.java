import java.util.*;


class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int j=0; j<flag.length; j++){
            if(flag[j]){
                for(int i=0; i<arr[j]*2; i++){
                    list.add(arr[j]);
                }
                
                
            }else{
                for(int i=0; i<arr[j]; i++){
                    if(list.size()!=0)
                    list.remove(list.size()-1);
                    
                }
                
            }
        }
        
        int[] answer = new int[list.size()];

        for(int i=0; i<list.size(); i++){
            answer[i]=list.get(i);
            
            
        }
        
        
        
        return answer;
    }
}