import java.util.*;


class Solution {
    public int[] solution(int[] emergency) {
        
        List<Integer> originlist = new ArrayList<>();
        List<Integer> sortedlist = new ArrayList<>();


        int[] answer = new int[emergency.length];


        for (int i : emergency) {
            originlist.add(i);
            sortedlist.add(i);
        }

        Collections.sort(sortedlist);


        int idx=1;
        for(int i= sortedlist.size()-1;  i>=0; i--){
            answer[originlist.indexOf(sortedlist.get(i))]=idx++;
        }
        
        
        
        
        
        return answer;
    }
}