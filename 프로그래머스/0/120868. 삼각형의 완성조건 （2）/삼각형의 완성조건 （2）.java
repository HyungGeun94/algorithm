import java.util.*;


class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);
        
        for(int i=1;  i<=sides[1]; i++){
            if(i+sides[0]>sides[1]){
            answer++;
            System.out.println(i);

            }
        }
        
        for(int i=sides[1]+1; i<sides[0]+sides[1]; i++){
            answer++;
                        System.out.println(i);

        }
        
        
        return answer;
    }
}