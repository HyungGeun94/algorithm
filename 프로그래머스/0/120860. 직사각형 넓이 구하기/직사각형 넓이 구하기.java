import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        
        Set<Integer> setX = new HashSet<>();
        Set<Integer> setY = new HashSet<>();
        
        for(int i=0; i<dots.length; i++){
            for(int j=0; j<dots[i].length; j++){
                
                setX.add(dots[i][0]);
                setY.add(dots[i][1]);
                
            }
        }
        
        List<Integer> listX = new ArrayList<>(setX);
        List<Integer> listY = new ArrayList<>(setY);
        
        return Math.abs(listX.get(0)-listX.get(1))*Math.abs(listY.get(0)-listY.get(1));
        
    }
}