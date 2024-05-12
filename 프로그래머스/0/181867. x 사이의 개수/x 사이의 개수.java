class Solution {
    public int[] solution(String myString) {
        
        
      String[] strArr = myString.split("x",-1);

        int[] arr = new int[strArr.length];



        for(int i=0; i<strArr.length; i++){

            arr[i] = strArr[i].length();
        }
        
        return arr;
    }
}