import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list, int n) {
        
        
        return IntStream.range(0,num_list.length).filter(num -> num%n ==0).map(num -> num_list[num])
            .toArray();
    }
}