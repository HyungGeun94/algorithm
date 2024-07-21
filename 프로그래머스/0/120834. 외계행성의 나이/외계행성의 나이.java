class Solution {
    public String solution(int age) {
        String answer = "";
        
        String str = age+"";
        
        char[] strArr = {'a','b','c','d','e','f','g','h','i','j'};
        
        
        for(int i=0; i<str.length(); i++){
            
            answer+=strArr[str.charAt(i)-'0'];
            
        }
        
        return answer;
    }
}