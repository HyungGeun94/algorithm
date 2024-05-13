class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        int arr1Sum = 0;
        
        int arr2Sum = 0;
        
        if(arr1.length != arr2.length){
            answer = arr1.length> arr2.length ? 1 : arr1.length==arr2.length ? 0 : -1;
            
        }else{
            
            for(int i : arr1){
                arr1Sum+=i;
            }
            for(int i : arr2){
                arr2Sum+=i;
            }
            
            answer = arr1Sum > arr2Sum ? 1 : arr1Sum==arr2Sum ? 0 : -1;
            
        }
        
        
        
        return answer;
    }
}