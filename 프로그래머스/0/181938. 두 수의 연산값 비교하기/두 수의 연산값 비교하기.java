class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int sum= Integer.parseInt(""+a+b); 
        int multi = 2*a*b;
        
        return sum > multi ? sum : multi;
    }
}