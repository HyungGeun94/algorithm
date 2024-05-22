import java.util.*;


class Solution {
    public int[] solution(int[] answers) {
        
        int[] first =  {1, 2, 3, 4, 5};
        int hitfirst = 0;
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int hitsecond = 0;
        int[] third =  {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int hitthird = 0;
        
        for(int i=0; i<answers.length; i++){
            
            
            if(answers[i]==first[i%5]){
                hitfirst++;
            }
            
            if(answers[i]==second[i%8]){
                hitsecond++;
            }
            
            if(answers[i]==third[i%10]){
                hitthird++;
            }
        }   
        
        int maxScore = Math.max(hitfirst, Math.max(hitsecond, hitthird));
        
        List<Integer> topScorers = new ArrayList<>();
        if(hitfirst == maxScore) {
            topScorers.add(1);
        }
        if(hitsecond == maxScore) {
            topScorers.add(2);
        }
        if(hitthird == maxScore) {
            topScorers.add(3);
        }
        
        int[] answer = new int[topScorers.size()];
        for(int i = 0; i < topScorers.size(); i++) {
            answer[i] = topScorers.get(i);
        }
        
        return answer;
    }
}