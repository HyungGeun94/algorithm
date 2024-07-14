class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int order = Integer.parseInt(""+a+b);
        int reverse = Integer.parseInt(""+b+a);
        
        return Math.max(order,reverse);
    }
}