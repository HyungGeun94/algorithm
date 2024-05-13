class Solution {
    public int solution(int n) {
        int answer = 0;

        
        for(int i=1; i<=n; i++){
            int hap = 0;
            for(int j=1; j<=i ; j++){
                
                if(i%j==0){
                    hap++;
                }
                
                
                
            }
            answer += hap >=3 ? 1 : 0 ;
        }
        
        return answer;
    }
}