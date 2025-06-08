import java.util.stream.LongStream;


class Solution {
    public long[] solution(int x, int n) {
        return LongStream
               .rangeClosed(1,n)
                .map(num ->num*x)
                .toArray();
    }
}