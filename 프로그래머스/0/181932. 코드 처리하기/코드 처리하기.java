class Solution {
    public String solution(String code) {
        
        int mode = 0;
        
        StringBuffer sb = new StringBuffer();
        
        
        for(int i=0; i<code.length(); i++ ){
            if(code.charAt(i)=='1'){
                mode = mode == 0 ? 1 : 0 ;
            }else if(mode == 0 && i%2==0){
                sb.append(code.charAt(i));
            }else if(mode == 1 && i%2!=0){
                sb.append(code.charAt(i));
            }
        }
        
        if(sb.length()==0){
            sb.append("EMPTY");
        }
        
        
 
        
        
        return sb.toString();
    }
}