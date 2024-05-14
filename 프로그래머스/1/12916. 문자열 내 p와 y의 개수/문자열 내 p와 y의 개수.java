class Solution {
    boolean solution(String s) {
        
        int toggle = 0;
        
        
        for(int i=0; i<s.length(); i++){
            
            if(s.charAt(i)=='p' || s.charAt(i)=='P'){
                toggle++;
            }else if(s.charAt(i)=='y' || s.charAt(i)=='Y'){
                toggle--;
            }
            
            
            
        }
        
        


        return toggle == 0 ? true : false;
    }
}