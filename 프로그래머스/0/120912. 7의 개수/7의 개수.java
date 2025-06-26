class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i : array){
            
            String str = String.valueOf(i);
            
            char[] chArr = str.toCharArray();
            
            for(char ch : chArr){
                
                if(ch=='7'){
                    answer++;
                }
                
            }
            
        }
        
        return answer;
    }
}