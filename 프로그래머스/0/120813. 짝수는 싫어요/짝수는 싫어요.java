class Solution {
    public int[] solution(int n) {
        
        int count = n%2==0 ? n/2 : n/2+1;
        
        int[] answer = new int[count];
        
        int index=0;
        
        for(int i=1; i<=n; i+=2){
            
            answer[index++]=i;
            
            
            
        }
        
        return answer;
    }
}