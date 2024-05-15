class Solution {
    public String solution(int age) {
        String strAge = ""+age;
        
        char[] ageArr = {'a','b','c','d','e','f','g','h','i','j'};
        
        String answer ="";
        
        for(int i=0; i<strAge.length(); i++){
            
            answer += ageArr[strAge.charAt(i)-'0'];
          
            
        }
        
        
        
        
        
        
        
        
        return answer;
    }
}