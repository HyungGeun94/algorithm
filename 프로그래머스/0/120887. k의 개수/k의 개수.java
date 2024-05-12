class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        StringBuffer sb= new StringBuffer();
        for(int t=i; t<=j; t++){
            sb.append(t);
        }
        
        char[] c = sb.toString().toCharArray();
        
        for(char cha : c){
            if(cha==k+'0'){
                answer++;
            }
        }
        
        
        return answer;
    }
}