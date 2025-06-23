class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        if(pat.length()==1){
            answer = myString.substring(0,myString.lastIndexOf(pat)+1);
        }else{
            answer = myString.substring(0,myString.lastIndexOf(pat)+pat.length());
        }
        
        return answer;
    }
}