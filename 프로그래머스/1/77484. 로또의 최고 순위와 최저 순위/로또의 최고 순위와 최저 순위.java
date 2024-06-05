import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        // 0의 개수와 일치하는 번호의 개수 계산
        int zeroCount = 0;
        int matchCount = 0;
        
        Set<Integer> winNumsSet = new HashSet<>();
        for (int num : win_nums) {
            winNumsSet.add(num);
        }
        
        for (int num : lottos) {
            if (num == 0) {
                zeroCount++;
            } else if (winNumsSet.contains(num)) {
                matchCount++;
            }
        }
        
        // 최고 순위와 최저 순위 계산
        answer[0] = getRank(matchCount + zeroCount); // 최고 순위
        answer[1] = getRank(matchCount); // 최저 순위
        
        return answer;
    }
    
        private int getRank(int matchCount) {
        switch (matchCount) {
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6;
        }
    }
}
