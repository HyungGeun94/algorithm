class Solution {
    public int solution(int a, int b) {
        
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        
        int sumAB = Integer.parseInt(strA+strB);
        int sumBA = Integer.parseInt(strB+strA);
        
        
        return Math.max(sumAB,sumBA);
    }
}