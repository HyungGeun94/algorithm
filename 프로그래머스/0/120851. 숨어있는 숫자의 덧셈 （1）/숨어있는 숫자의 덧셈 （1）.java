class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(int i=0; i<my_string.length(); i++ ){
            answer += my_string.charAt(i)>='0' &&  my_string.charAt(i)<='9' ? my_string.charAt(i)-'0' : 0;
            
            
        }
        
        return answer;
    }
}