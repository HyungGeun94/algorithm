class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        
        if(num_list.length>=11){
            for(int i : num_list){
                sum+=i;
            }
            
        }else{
            sum=1;

            for(int i : num_list){
                sum*=i;
            }
        }
        
        
        
        return sum;
    }
}