import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int[] pow = {2,4,8,16,32,64,128,256,512,1024};
        
        if(arr.length==1 || arr.length==2){
            return arr;
        }
        
        int size = 0;
        
        for(int i=pow.length-1 ; i>=0; i--){
            
            if(arr.length>pow[i]){
                
                size= pow[i+1];
                
                break;
            }
            
        }
        
        
        int[] answer = new int[size];
        
        for(int i=0; i<arr.length; i++){
            answer[i]=arr[i];
        }
        
        
        
        return answer;
    }
}