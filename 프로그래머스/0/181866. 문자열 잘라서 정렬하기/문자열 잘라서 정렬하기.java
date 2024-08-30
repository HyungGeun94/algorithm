import java.util.*;
class Solution {
    public List<String> solution(String myString) {
        List<String> list = new ArrayList<>();
        String ans[] = myString.split("x");
        Arrays.sort(ans);
        for(int i=0; i<ans.length; i++){
            if(!ans[i].equals(""))
                list.add(ans[i]);
        }
        return list;
    }
}
