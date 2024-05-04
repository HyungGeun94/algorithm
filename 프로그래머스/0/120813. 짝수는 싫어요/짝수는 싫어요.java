class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(int)(Math.round((double)n/2))];
        
        for(int i=1,j=0 ; i<=n; i++){
            if(i%2!=0){
                answer[j]=i;
                j++;
            }
            
        }
        
        
        
        return answer;
    }
}