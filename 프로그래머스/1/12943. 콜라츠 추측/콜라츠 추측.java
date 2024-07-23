class Solution {
    public int solution(int num) {
        int answer = 0;
        
        long number = num;
        
        
        while(true){
            
            if(number==1){
                break;
            }else if(answer>500){
                answer=-1;
                break;
            }else{
                if(number%2==0){
                    number= number/2;
                    answer++;
                }else{
                    number= (number*3+1);
                    answer++;
                }
            }
            
            
        }
        
        
        return answer;
    }
}