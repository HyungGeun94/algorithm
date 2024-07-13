class Solution {
    public int[] solution(int start_num, int end_num) {
        
        
        int[] array = new int[start_num-end_num+1];
        
        for(int i=start_num; i>=end_num; i--){
            
            array[start_num-i]=i;
            
        }

        return array;
    }
}