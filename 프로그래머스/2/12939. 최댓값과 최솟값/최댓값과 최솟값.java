class Solution {
    public String solution(String s) {
        
        String[] strArr = s.split(" ");
        
        int max = Integer.parseInt(strArr[0]);
        int min = Integer.parseInt(strArr[0]);
        for(int i=1; i<strArr.length; i++){
            
            int num = Integer.parseInt(strArr[i]);
            
            max = Math.max(max,num);
            min = Math.min(min,num);
            
        }
        
        
        return min + " " +max;
    }
}