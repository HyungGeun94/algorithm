import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int[] answer1 = {1,2,3,4,5};
        int[] answer2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] answer3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        
            for(int i=0; i<answers.length; i++){
                
                if(answer1[i%answer1.length]==answers[i]){
                    sum1++;
                }
                if(answer2[i%answer2.length]==answers[i]){
                    sum2++;
                }
                if(answer3[i%answer3.length]==answers[i]){
                    sum3++;
                }
                
            }    
        
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        
        
        if(sum1==sum2 && sum2==sum3){
            return new int[]{1,2,3,};
        }else if(sum1> sum2 && sum1> sum3){
            return new int[]{1};
        }else if(sum2 > sum1 && sum2 > sum3){
            return new int[]{2};
        }else if(sum3 > sum1 && sum3 > sum2){
            return new int[]{3};
        }else if(sum1==sum2){
            return new int[]{1,2};
        }else if(sum2==sum3){
            return new int[]{2,3};
        }else if(sum3==sum1){
            return new int[]{1,3};
        }
        
        return answer;
    }
}