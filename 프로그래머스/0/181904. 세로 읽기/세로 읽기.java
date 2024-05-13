class Solution {
    public String solution(String my_string, int m, int c) {
        
        StringBuffer sb = new StringBuffer();
        
        char[] chArr = my_string.toCharArray();
        
        for(int i=c-1; i<chArr.length; i+=m){
            sb.append(chArr[i]);
            
            
            
        }
        
        
        return sb.toString();
    }
}