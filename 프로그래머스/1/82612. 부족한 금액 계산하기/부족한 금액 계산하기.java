class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long money1 = money;
        
        for(int i=1; i<=count; i++){
            
            money1= money1 - price*i;
            
        }
        
        if(money1<=0){
            answer=money1;
        }

        return Math.abs(answer);
    }
}