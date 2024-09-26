import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        
        List<Integer> list = new ArrayList<>();
        
        int i=0;
        
        while(i<arr.length){
            
            if(list.isEmpty()){
                list.add(arr[i]);
            }else if(list.get(list.size()-1) == arr[i]){
                list.remove(list.size()-1);
            }else{
                list.add(arr[i]);
            }
            
            i++;
        }
        
        int[] answer = new int[list.size()];
        
        for(int j=0; j<list.size(); j++){
            answer[j]=list.get(j);
        }
        
        if(answer.length==0){
            answer=new int[]{-1};
        }
        

        
        return answer;
    }
}