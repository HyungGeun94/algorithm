class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        StringBuffer sb = new StringBuffer();
        
        for(int i=0; i<myString.length();i ++){
            
            if(myString.charAt(i)=='A'){
                sb.append("B");
            }else{
                sb.append("A");
            }
            
        }
        
        
        return new String(sb).contains(pat) ? 1 : 0;
    }
}