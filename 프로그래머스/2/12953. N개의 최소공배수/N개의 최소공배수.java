import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        Arrays.sort(arr);
        for(int j=1; j<=2100000000; j++){    
                
            answer=0;

            for(int i=0; i<arr.length; i++){
                
                if(j%arr[i]!=0){
                    
                    break;
                    
                }else if(j%arr[i]==0){
                    answer++;
                    
                    if(answer==arr.length){
                        
                        return j;
                    }
                    
                    
                }


            }
        }
        
        
        return answer;
    }
}