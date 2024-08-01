class Solution {
    public String solution(String s) {
        
        String[] strArr = s.split(" ");
        
        int min = Integer.parseInt(strArr[0]);
        int max = Integer.parseInt(strArr[0]);
        
        
        for(int i=1; i<strArr.length; i++){
            
            int num = Integer.parseInt(strArr[i]);
            
            if(min>num){
                min=num;
            }else if(max<num){
                max=num;
            }
            
        }
        
        
        return min+" "+max;
    }
}