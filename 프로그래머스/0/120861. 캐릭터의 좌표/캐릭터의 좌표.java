class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        
        
        for(String str : keyinput){
            
            if(str.equals("left")){
                answer[0]= Math.abs(answer[0]-1) <= Math.abs((board[0]-1)/2) ? answer[0]-1 :answer[0] ;

                
            }else if(str.equals("right")){
                answer[0]= Math.abs(answer[0]+1) <= Math.abs((board[0]-1)/2) ? answer[0]+1 : answer[0];

                
            }else if(str.equals("up")){
                answer[1]= Math.abs(answer[1]+1) <= Math.abs((board[1]-1)/2) ? answer[1]+1 : answer[1];
            }else {
                answer[1]= Math.abs(answer[1]-1) <= Math.abs((board[1]-1)/2) ? answer[1]-1 : answer[1];

            }
            
            
        }
        
        
        return answer;
    }
}