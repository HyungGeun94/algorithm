import java.util.stream.IntStream;


class Solution {
    public String solution(int q, int r, String code) {
        
        return IntStream.range(0,code.length()).boxed().filter(num -> num%q==r)
            .map(num -> String.valueOf(code.charAt(num))).reduce("",(a,b)->a+b);
    }
}