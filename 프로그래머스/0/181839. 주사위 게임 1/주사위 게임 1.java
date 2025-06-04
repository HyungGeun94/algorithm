class Solution {
    public int solution(int a, int b) {
        boolean aIsOdd = a % 2 == 1;
        boolean bIsOdd = b % 2 == 1;

        if (aIsOdd && bIsOdd) {
            return a * a + b * b;  
        }

        if (aIsOdd || bIsOdd) {
            return 2 * (a + b);    
        }

        return Math.abs(a - b);  
    }
}