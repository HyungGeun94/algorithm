class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int i=0; i<queries.length; i++){
            
            int x1 = queries[i][0];
            int x2 = queries[i][1];
            
            int tmp = arr[x1];
            arr[x1] = arr[x2];
            arr[x2] = tmp;
            
            
        }
        
        return arr;
    }
}