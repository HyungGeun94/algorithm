import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int[] sizesW =new int[sizes.length];
        int[] sizesH =new int[sizes.length];
        
        for(int i=0; i<sizes.length; i++){
            
            int w = sizes[i][0];
            int h = sizes[i][1];
            
            sizesW[i]=Math.max(w,h);
            sizesH[i]=Math.min(w,h);
            
        }
        
        Arrays.sort(sizesW);
        Arrays.sort(sizesH);
        
        
        return sizesW[sizesW.length-1] * sizesH[sizesH.length-1];
    }
}