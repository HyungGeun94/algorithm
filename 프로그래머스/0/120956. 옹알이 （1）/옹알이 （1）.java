class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(int i=0; i<babbling.length; i++){
            
            babbling[i] = babbling[i]
                .replace("aya","0")
                .replace("ye","0")
                .replace("woo","0")
                .replace("ma","0");
            
            babbling[i] = babbling[i].replace("0","");
            System.out.println(babbling[i]);
            
            
            if(babbling[i].equals("")){
                answer++;
            }
            
        }
        
        return answer;
    }
}