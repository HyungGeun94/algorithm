class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++){
            
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                if((char)(s.charAt(i)+n)>'z'){
                    answer+=((char)((s.charAt(i)+n-'z' +'a'-1)));
                    
                }else{
                    answer+=((char)(s.charAt(i)+n));
                }
                
            }
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                if((char)(s.charAt(i)+n)>'Z'){
                    answer+=((char)((s.charAt(i)+n-'Z' +'A'-1)));
                    
                }else{
                    answer+=((char)(s.charAt(i)+n));
                }
                
                
            }else{
   
                answer+=s.charAt(i);
                
            }
        }
        return answer;
    }
}