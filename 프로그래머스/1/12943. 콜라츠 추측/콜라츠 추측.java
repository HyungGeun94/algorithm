class Solution {
    public int solution(int num) {
        
        int answer = 0;
        
        while(num!=1){
            
            if(num%2==0){
                num/=2;
                answer++;

            }else{
                num= (num *3) +1;
                answer++;
            }
            
            
            if(answer>400){
                break;
            }
        
            
        }
        
        return answer>400 ? -1 : answer;
    }
}