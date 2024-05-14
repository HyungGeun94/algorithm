import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        
        List<Integer> list = new ArrayList<>();


        for (int i : numbers) {
            list.add(i);
        }

        if(direction.equals("right")){
        Collections.rotate(list,1);
        }
        else{
            Collections.rotate(list,-1);
        }

        for (int i=0; i<list.size(); i++){
            numbers[i]=list.get(i);

        }

        return numbers;
    }
}