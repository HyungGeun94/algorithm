class Solution {
    public String solution(String rsp) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<rsp.length(); i++){
            
            int number = rsp.charAt(i)-'0';
            
            if(number==2){
                sb.append(0);
                
            }else if(number==0){
                sb.append(5);
                
            }else if(number==5){
                sb.append(2);
                
            }
        }
            
            
            return sb.toString();
            
    }
}