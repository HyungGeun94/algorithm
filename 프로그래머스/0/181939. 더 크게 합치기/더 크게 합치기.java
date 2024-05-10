class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String first = ""+a+b;
        String last = ""+b+a;
        return Integer.parseInt(first) > Integer.parseInt(last) ? Integer.parseInt(first)  :Integer.parseInt(last)  ;
    }
}