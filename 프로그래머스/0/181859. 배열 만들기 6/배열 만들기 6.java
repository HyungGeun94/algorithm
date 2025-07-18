import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int i=0;
        
        List<Integer> list = new ArrayList<>();
        
        while(i<arr.length){
            
            if(list.isEmpty()){
                list.add(arr[i]);
                i++;
            }else if(list.get(list.size()-1)== arr[i]){
                list.remove(list.size()-1);
                i++;
            }else if(list.get(list.size()-1)!= arr[i]){
                list.add(arr[i]);
                i++;
            }
        }
        
        int[] answer = list.stream().mapToInt(integer->integer).toArray();
        
        return answer.length == 0 ? new int[]{-1} : answer;
    }
}