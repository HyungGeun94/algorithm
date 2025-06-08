class Solution {
    public String solution(int age) {
        
        String answer="";
        
        
        String[] str = {"a","b","c","d","e","f","g","h","i","j"};
        
        String strAge = String.valueOf(age);
        
        for(int i=0; i<strAge.length(); i++){
            
            answer+=str[strAge.charAt(i)-'0'];
            
        }
        
        return answer;
    }
}