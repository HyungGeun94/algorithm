class Solution {
    public String solution(String my_string) {

       
                StringBuffer sb = new StringBuffer();
        
        for(char c : my_string.toCharArray()){
        
            
            if(c>='a' && c<='z'){
                 sb.append((c+"").toUpperCase());
            }
            else if(c>='A' &&c<='Z'){
                 sb.append((c+"").toLowerCase());
            }
        }
        
                return sb.toString();

    }        

}
        
