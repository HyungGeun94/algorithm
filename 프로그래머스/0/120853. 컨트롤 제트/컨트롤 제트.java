class Solution {
    public int solution(String s) {
        String[] split = s.split(" ");
        
        int sum=0;
        
        for(int i=0; i< split.length; i++){
            
            sum += split[i].equals("Z") ? -Integer.parseInt((split[i-1])) : Integer.parseInt(split[i]); 
            
        }        
        return sum;
    }
}