import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        
        int scorelength = score.length;
        
        int[] answer = new int[scorelength];
        
        List<Integer> list = new ArrayList<>();
        List<Integer> answerlist = new ArrayList<>();
       
        if(k<=score.length){
        for(int i=0; i<k;i++){
            list.add(score[i]);
            
            answerlist.add(Collections.min(list));
        }
        
        for(int i=k; i<scorelength; i++){
            list.add(score[i]);
            Collections.sort(list);
            answerlist.add(list.get(list.size()-k));
        }
        }else{
            for(int i=0; i<score.length;i++){
            list.add(score[i]);
            
            answerlist.add(Collections.min(list));
        }
            
        }
        
        for(int i=0; i<answerlist.size(); i++){
            
            answer[i]=answerlist.get(i);
        }
        
        
        
        
        
        
        return answer;
    }
}