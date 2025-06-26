class Solution {
    public int[][] solution(int[][] arr) {
        
        
        int x = arr.length;
        int y = arr[0].length;
        
        int finalNum = x > y ? x : y;
        
        int[][] answer = new int[finalNum][finalNum];
        
        for(int i=0; i<arr.length; i++){
            
            for(int j=0; j<arr[i].length; j++){
                
                answer[i][j]=arr[i][j];
                
                
                
                
                
            }
            
        }
        
        
        return answer;
    }
}