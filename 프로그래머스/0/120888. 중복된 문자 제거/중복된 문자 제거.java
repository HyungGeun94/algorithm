import java.util.*;

class Solution {
    public String solution(String my_string) {
         
        
        List<String> list = new ArrayList<>();

        String[] split = my_string.split("");

        for (String s : split) {
            if(!list.contains(s)){
            list.add(s);}
        }
        StringBuffer sb = new StringBuffer();
        for (String s : list) {

            sb.append(s);
        }




            return sb.toString();


    }
}