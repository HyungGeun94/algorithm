class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        
         double doubleA= a;
         double doubleB = b;

        
        if(((doubleA/doubleB)+"").length()<15){
            answer=1;
        }
        
        return answer;
    }
}