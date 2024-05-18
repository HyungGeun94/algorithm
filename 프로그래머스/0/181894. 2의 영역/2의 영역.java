class Solution {
    public int[] solution(int[] arr) {
        int firstIndex = -1;
        int lastIndex = -1;
        
        
        
        for(int i=0; i<arr.length; i++){
            
            if(arr[i]==2 && firstIndex==-1){
                firstIndex=i;
            }
            else if(arr[i]==2){
                lastIndex=i;
            }
            
        }
        
        if(firstIndex==-1){
            return new int[]{-1};
        }
        if(lastIndex==-1){
            return new int[]{2};
        }
        
        int[] answer = new int[lastIndex-firstIndex+1];
        
        for(int i=firstIndex; i<=lastIndex; i++){
            answer[i-firstIndex]= arr[i];
        }
        
        
        
        return answer;
    }
}