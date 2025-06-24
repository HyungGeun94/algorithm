class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i=0; i<queries.length; i++){
            
            int x1 = queries[i][0];
            int x2 = queries[i][1];
            
            for(int j=x1; j<=x2; j++){
                arr[j]+=1;
            }
            
        }
        
        return arr;
    }
}