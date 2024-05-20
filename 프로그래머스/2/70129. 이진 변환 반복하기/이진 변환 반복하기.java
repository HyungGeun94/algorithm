class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int totalCount=0;
        int totalZero=0;
        
        while(true){
            
            if(!s.equals("1")){
                
                for(int i=0; i<s.length(); i++){
                    if(s.charAt(i)=='0'){
                        totalZero++;
                    }
                    
                }
                
            s=s.replace("0","");
            s=Integer.toString(s.length(),2);    
                totalCount++;
                
            }
            
            if(s.equals("1")){
                break;
            }
            
        }
        
        answer[0]=totalCount;
        answer[1]=totalZero;

        return answer;
    }
}