import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        int[] originArr = Arrays.copyOf(arr,arr.length);
        int[] resultArr = new int[originArr.length];
        
        boolean parameter = true;
        int idx=0;
        while(parameter){
            for(int i=0; i<originArr.length; i++){

                if(originArr[i]%2==0 &&originArr[i]>=50){
                    resultArr[i]=originArr[i]/2;
                }else if(originArr[i]%2!=0 && originArr[i]<50){
                    resultArr[i]=(originArr[i]*2)+1;
                }else{
                    resultArr[i]=originArr[i];
                }

            }
            idx++;
            
            if(Arrays.equals(originArr,resultArr)){
                parameter=false;   
            }
            
            originArr= Arrays.copyOf(resultArr,resultArr.length);
            
        }
        
        return --idx;
    }
}