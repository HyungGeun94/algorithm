class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        
        for(int i=0; i<myString.length()-pat.length()+1; i++){
            
            String str =myString.substring(i,i+pat.length());
            
            System.out.println(str);
            if(str.contains(pat)){
                answer++;
            }
            
            
        }

            
        
        return answer;
    }
}