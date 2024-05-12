class Solution {
    public String solution(String s) {
        
        StringBuffer sb = new StringBuffer(s.toLowerCase());       
        boolean start = true;       
        if (s == null || s.isEmpty()) {
            return s;
        } 
        
        for(int i=0; i<sb.length() ;i++){
            
            // 공백이면 pass 
            if(sb.charAt(i) == ' '){
                start = true;
                continue;
            }
            
            // 숫자면 true
            if(0 <= sb.charAt(i) - '0' && sb.charAt(i)-'0'<= 9){
                  start = false;
            }
            else if(start == true && (sb.charAt(i)>='a' && sb.charAt(i)<='z')){
                
                sb.setCharAt(i,(sb.charAt(i)+"").toUpperCase().charAt(0));
                
                start=false;              
            }
            else if(sb.charAt(i)==' '){
                start=true;
            }    
          
        }
        
        return sb.toString();
    }
}