class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(int j=0; j<dic.length; j++){
            for(int i=0; i<spell.length; i++){
                
                
                if(!dic[j].contains(spell[i])){
                    answer=2;
                    break;
                }
                else{
                    answer=1;
                }
            }
            
            if(answer==1){
                break;
            }
            
        }
        
        
        
        
        return answer;
    }
}