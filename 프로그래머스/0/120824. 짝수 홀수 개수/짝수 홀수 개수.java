class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        
        int countodd=0;
        int countEven=0;
        
        for (int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                countEven++;
            }
            else{
                countodd++;
            }
            
        }
        answer[0]=countEven;
        answer[1]=countodd;
        
        return answer;
    }
}