class Solution {
    public String solution(String my_string) {
        
        StringBuffer sb = new StringBuffer();
        
        for(int i=0; i<my_string.length(); i++){
            
            String str = my_string.charAt(i)+"";
            
            if(sb.indexOf(str)==-1){
                sb.append(str);
            }
            
        }
        
        
        return sb.toString();
    }
}