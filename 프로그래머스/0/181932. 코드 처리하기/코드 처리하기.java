class Solution {
    public String solution(String code) {
        
        StringBuilder sb = new StringBuilder();
        
        int mode = 0;
        
        for(int i=0; i<code.length(); i++){
            char ch = code.charAt(i);
            
            if(ch=='1' && mode == 0){
                mode =1;
                
            }else if(ch=='1' && mode ==1){
                mode=0;
                
            }else if(mode ==0 && i%2==0){
                sb.append(ch);
                
            }else if(mode == 1 && i%2!=0){
                sb.append(ch);
                
            }
            
            
        }
        
        return sb.toString().isEmpty() ? "EMPTY" : sb.toString();
    }
}