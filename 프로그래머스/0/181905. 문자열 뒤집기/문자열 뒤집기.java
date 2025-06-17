class Solution {
    public String solution(String my_string, int s, int e) {
        
        String start = my_string.substring(0,s);
        
        String middle = my_string.substring(s,e+1);
        
        StringBuilder sb = new StringBuilder(middle);
        
        sb.reverse();
        
        String end = my_string.substring(e+1);
            
        
        
        return start+sb.toString()+end;
    }
}