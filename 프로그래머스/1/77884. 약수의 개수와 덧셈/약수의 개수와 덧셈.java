class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left; i<=right; i++){
                int yaksu=0;
            
            for(int j=1; j<=(int)Math.sqrt(i); j++){
                
                if(i%j==0){
                    
                    if(j*j==i){
                        yaksu+=1;
                    }else{
                        yaksu+=2;
                    }
                }
                
                
                
            }
            if(yaksu%2==0){
                    answer+=i;
                }else{
                answer-=i;
            }
            
            
        }
        
        return answer;
    }
}