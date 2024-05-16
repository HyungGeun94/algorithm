class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[my_str.length()/n + (my_str.length()%n==0 ? 0 : 1)];
        
        for(int i=0; i<answer.length; i++){
            
            answer[i]= i == answer.length-1 ? my_str.substring(i*n): my_str.substring(i*n,(i+1)*n);
            
        }
        
        return answer;
    }
}