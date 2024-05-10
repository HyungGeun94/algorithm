class Solution {
    public int solution(int[] num_list) {
        
        int multi=1;
        int sum2=0;
        
        for(int i : num_list){
            multi*=i;
            sum2+=i;
        }
            sum2=sum2*sum2;
        
        
        
        return multi < sum2 ? 1 : 0;
    }
}