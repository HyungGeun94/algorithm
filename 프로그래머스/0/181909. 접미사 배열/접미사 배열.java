import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        
        
        List<String> list = new ArrayList<>();
        
        for(int i=my_string.length()-1; i>=0 ; i--){
            
            list.add(my_string.substring(i));
            
        }
        
        String[] strArr = list.toArray(new String[0]);
        
        Arrays.sort(strArr);
        
        return strArr;
    }
}