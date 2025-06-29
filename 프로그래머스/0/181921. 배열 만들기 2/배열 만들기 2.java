import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=l; i<=r ; i++){
            
            boolean isAddList = true;
            
            String str =String.valueOf(i);
            
            for(int j=0; j<str.length(); j++){
                
                char ch = str.charAt(j);
                
                if(!(ch=='5' || ch=='0')){
                    
                    isAddList = false;
                    
                    break;
                    
                }
                
            }
            
            if(isAddList){
                list.add(i);
            }
            
            
            
        }
        
        return list.size()== 0 ? new int[]{-1} : list.stream().mapToInt(i->i).toArray();
    }
}