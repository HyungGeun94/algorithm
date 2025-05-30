import java.util.Arrays;
import java.util.stream.IntStream;



class Solution {
    public int[] solution(int start_num, int end_num) {
        return IntStream.rangeClosed(end_num,start_num).boxed().sorted((a,b) -> Integer.compare(b,a)).mapToInt(i -> i ).toArray();
    }
}