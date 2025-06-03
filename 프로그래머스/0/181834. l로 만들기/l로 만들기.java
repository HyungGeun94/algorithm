class Solution {
    public String solution(String myString) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<myString.length(); i++){
            
            char ch = myString.charAt(i);
            
            sb.append(ch<'l' ? 'l' : ch);
            
            
        }
        
        return sb.toString();
    }
}