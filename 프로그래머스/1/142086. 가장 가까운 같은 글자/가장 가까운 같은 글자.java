class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i=0; i<s.length(); i++){
            
            String str = s.substring(0,i);
            
            String ch = String.valueOf(s.charAt(i));
            
            str.lastIndexOf(ch);
            
            
            if(str.lastIndexOf(ch)==-1){
                answer[i]= str.lastIndexOf(ch);    
            }else{
                answer[i]=i-str.lastIndexOf(ch);
            }
            
            
            
            
        }
        
        return answer;
    }
}