import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int[] x = new int[dots.length];
        int[] y = new int[dots.length];
        
        
        for(int i=0; i<dots.length; i++){
            
            x[i]=dots[i][0];
            y[i]=dots[i][1];            
            
        }
        
        Arrays.sort(x);
        Arrays.sort(y);
        
        return (x[x.length-1]-x[0]) * (y[y.length-1]-y[0]);
    }
}