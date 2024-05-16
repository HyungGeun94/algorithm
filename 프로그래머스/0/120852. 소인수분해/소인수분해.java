import java.util.*;


class Solution {
    public int[] solution(int n) {
        
        int i=2;
        
        List<Integer> list = new ArrayList<>();
        
        while(n!=1){
            
                if(n%i==0){
                    n/=i;
                    list.add(i);
                }else{
                    i++;
                }
            
        }
        
        Set<Integer> set = new HashSet<>(list);
        list = new ArrayList<>(set);

        
        
        
        
        int[] answer = new int[list.size()];
        
        for(int j=0; j<list.size();j++){
            answer[j]=list.get(j);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}