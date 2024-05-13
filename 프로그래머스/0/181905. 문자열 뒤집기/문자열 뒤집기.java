class Solution {
    public String solution(String my_string, int s, int e) {
        
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        
        sb.append(my_string.substring(0,s));
        
        sb2.append(my_string.substring(s,e+1));
        
        sb2.reverse();
        
        
        sb.append(sb2);
        
        sb.append(my_string.substring(e+1));
        
        
        
        
        
        return sb.toString();
    }
}