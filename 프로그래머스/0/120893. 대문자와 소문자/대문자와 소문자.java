class Solution {
    public String solution(String my_string) {
        
        StringBuilder sb = new StringBuilder();
        
        for(char ch : my_string.toCharArray()){
            
            if(ch>='a' && ch<='z'){
                
                sb.append(Character.toUpperCase(ch));
                
            }else{
                
                sb.append(Character.toLowerCase(ch));
            }
            
        }
        return sb.toString();
    }
}