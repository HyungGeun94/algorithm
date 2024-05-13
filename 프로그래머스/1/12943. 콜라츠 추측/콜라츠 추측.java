class Solution {
    public int solution(int num) {
        
        long lNum = num;
        int answer = 0;
        
        while(lNum!=1){
            
            if(lNum%2==0){
                lNum/=2;
                answer++;

            }else{
                lNum= (lNum *3) +1;
                answer++;
            }
            
            
            if(answer>500){
                break;
            }
        
            
        }
        
        return answer>500 ? -1 : answer;
    }
}