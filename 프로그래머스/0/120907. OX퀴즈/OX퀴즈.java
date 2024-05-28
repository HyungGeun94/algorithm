class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++){
            
            String[] split = quiz[i].split(" ");
            
            for(int j=0; j<split.length; j++){
                
                if(split[1].equals("+") && 
                   Integer.parseInt(split[0])+Integer.parseInt(split[2]) == Integer.parseInt(split[4])){
                    answer[i]="O";
                }
                else if(split[1].equals("-") && 
                   Integer.parseInt(split[0])-Integer.parseInt(split[2]) == Integer.parseInt(split[4])){
                    answer[i]="O";
                }else{
                    answer[i]="X";
                }
                
                
            }
            
            
        }
        
        
        return answer;
    }
}