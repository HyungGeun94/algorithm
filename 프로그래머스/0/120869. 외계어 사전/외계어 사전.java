import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        Arrays.sort(spell);
        
        for(int i=0; i<dic.length; i++){
            
            String str = dic[i];
            
            String[] strArray = str.chars()
                                .mapToObj(ch -> String.valueOf((char)ch))
                                .sorted()
                                .toArray(size -> new String[size]);
            
            if(Arrays.equals(spell,strArray)){
                return 1;
            }
            
            
            
        }
        
        return answer;
    }
}