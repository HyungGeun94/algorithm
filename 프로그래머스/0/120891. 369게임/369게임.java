import java.util.stream.IntStream;

class Solution {
    public int solution(int order) {
        
        String str = String.valueOf(order);
        
        
        
        
        return (int)IntStream.range(0,str.length()).filter(i->str.charAt(i) == '3' || str.charAt(i) =='6' || str.charAt(i) == '9').count();
    }
}