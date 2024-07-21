class Solution {
    public String solution(int[] numLog) {
        
        StringBuffer sb = new StringBuffer();
        
        for(int i=1; i<numLog.length; i++){
            int number = numLog[i]-numLog[i-1];
            
            if(number==1){
                sb.append('w');
            }else if(number==-1){
                sb.append('s');
            }else if(number==10){
                sb.append('d');
            }else{
                sb.append('a');
            }
            
            
        }
        

        return sb.toString();
    }
}