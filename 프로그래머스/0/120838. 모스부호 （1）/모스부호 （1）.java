class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] morseArr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String[] letterArr = letter.split(" ");
        
        for(String str : letterArr){
            
            for(int i=0; i< morseArr.length;  i++){
                
                if(str.equals(morseArr[i])){
                    answer = answer + (char)('a' + i);
                    break;
                }
                
            }
            
        }
        
        
        return answer;
    }
}