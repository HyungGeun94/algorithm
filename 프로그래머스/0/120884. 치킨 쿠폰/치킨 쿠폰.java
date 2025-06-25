class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = 0;
        
        while ( chicken / 10 !=0){
            coupon = chicken / 10 ;
            answer += coupon ; 
            chicken = chicken % 10;
            chicken += coupon ; 
            
            
        }
        
        
        
        return answer;
    }
}